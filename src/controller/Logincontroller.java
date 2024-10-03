package src.controller;

import src.Backend.validacion;
import src.view.Doctorview;
import src.view.loginview;
import src.model.pacientedatabase; // Asegúrate de que esta clase exista y tenga los métodos necesarios

import javax.swing.JOptionPane; // Importa JOptionPane para manejar diálogos de mensaje
import java.util.HashMap;

public class Logincontroller {
    private loginview loginview;
    private validacion validacionDatodds;
    private pacientedatabase pacientesDB; // Agregar el atributo para la base de datos de pacientes

    public Logincontroller(loginview loginView, validacion validacionDatodds) {
        this.loginview = loginView;
        this.validacionDatodds = validacionDatodds;
        this.pacientesDB = new pacientedatabase(); // Inicializar la base de datos de pacientes
        initController();
    }

    public void initController() {
        loginview.getLoginButton().addActionListener(e -> iniciarsesion());
    }

    public void iniciarsesion() {
        String usuario = loginview.getEmailField().getText();
        String contraseña = new String(loginview.getPasswordField().getPassword());

        HashMap<String, String> resultado = validacionDatodds.validar(usuario, contraseña);

        // Verificar si resultado es nulo o vacío
        if (resultado == null || resultado.isEmpty()) {
            // Mostrar un mensaje al usuario en caso de error
            JOptionPane.showMessageDialog(loginview, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Sale del método
        }

        String nombreDoctor = resultado.get("nombre");
        String especialidad = resultado.get("especialidad");

        // Usar la instancia de pacientesDB
        Doctorview doctorView = new Doctorview();
        doctorView.setVisible(true);
    }
}



