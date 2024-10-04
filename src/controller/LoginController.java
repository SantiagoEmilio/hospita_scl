package src.controller;
import view.loginview;
import Backend.validacion;
import java.util.HashMap;
import view.Doctorview;
import model.databasepaciente;
public class LoginController {
    private loginview loginview;
   private  validacion validacion;
   private databasepaciente pvc;
    public LoginController(loginview loginview, Backend.validacion validacion){
        this.loginview=loginview;
        this.validacion= this.validacion;
        this.pvc=new databasepaciente();
        initController();
    }
    public void initController() {
        loginview.getLoginButton().addActionListener(e -> iniciarsesion());
    }

    private void iniciarsesion() {
    String usuario=loginview.getEmailField().getText();
    String password=new String(loginview.getPasswordField().getPassword());
        HashMap<String,String>respuesta=validacion.validacionar(usuario,password);

        if (!respuesta.isEmpty()){
            String nombredoctor=respuesta.get("nombre");
            String especialidad=respuesta.get("especialidad");

            Doctorview  doctorview=new Doctorview(nombredoctor,especialidad,pvc);
            doctorview.setVisible((true));

        }

    }
}
