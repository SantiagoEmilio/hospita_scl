package view;

import model.databasepaciente;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import model.salas;
import model.datsals;
import model.datapaciente;

public class Doctorview extends JFrame {
    private JLabel nombreDoctorLabel;
    private JLabel especialidadLabel;
    private ArrayList<salas> listado;
    private databasepaciente pvc;
    private JPanel panelCentro;
    private int[] pantalla = {1300, 800};

    public Doctorview(String nombreDoctor, String especialidad, databasepaciente pvc) {
        // Configuración básica del JFrame
        setTitle("Hospital Santa Catalina - Perfil del doctor");
        setSize(pantalla[0], pantalla[1]);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel Header
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.DARK_GRAY);
        headerPanel.setLayout(new BorderLayout());

        // JLabel para el nombre del hospital
        JLabel hospitalLabel = new JLabel("Hospital Santa Catalina");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        hospitalLabel.setHorizontalAlignment(SwingConstants.LEFT);
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Información del doctor
        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new GridLayout(2, 1));
        doctorInfoPanel.setBackground(Color.DARK_GRAY);

        // Etiquetas para el nombre y especialidad del doctor
        nombreDoctorLabel = new JLabel("Nombre del doctor: " + nombreDoctor);
        nombreDoctorLabel.setForeground(Color.WHITE);
        especialidadLabel = new JLabel("Especialidad: " + especialidad);
        especialidadLabel.setForeground(Color.WHITE);

        doctorInfoPanel.add(nombreDoctorLabel);
        doctorInfoPanel.add(especialidadLabel);
        headerPanel.add(doctorInfoPanel, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);

        // Inicialización del panel central
        panelCentro = new JPanel(new BorderLayout());
        add(panelCentro, BorderLayout.CENTER);

        // Cargar la lista de salas
        datsals datasalas = new datsals();
        listado = datasalas.getListado();

        // Agregar el menú lateral
        JPanel menuLateral = componentesMenuLateral();
        add(menuLateral, BorderLayout.WEST);

        // Cargar pacientes

    }



    private JPanel componentesMenuLateral() {
        JPanel menu = new JPanel();
        menu.setPreferredSize(new Dimension(250, pantalla[1]));
        menu.setBackground(Color.DARK_GRAY);
        menu.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        JPanel opciones = new JPanel();
        opciones.setLayout(new GridLayout(0, 1, 10, 10));

        // Agregamos las opciones del menú con sus acciones
        opciones.add(op("Consultas del día", e -> System.out.println("Consultas del día")));
        opciones.add(op("Salas", e -> msa())); // Changed to call msa()
        opciones.add(op("Farmacia", e -> System.out.println("Farmacia")));
        opciones.add(op("Pacientes registrados", e -> System.out.println("pppa")));
        opciones.add(op("Citar en otra área", e -> System.out.println("Citar en otra área")));

        menu.add(opciones);
        return menu;
    }

    private JButton op(String texto, java.awt.event.ActionListener actionListener) {
        JButton boton = new JButton(texto);
        boton.addActionListener(actionListener);
        return boton;
    }





    private void msa() {
        salasview panels = new salasview(listado);
        for (salas sala : listado) {
            System.out.println("Sala Nombre: " + sala.getNombre());
            System.out.println("Estado de la sala: " + sala.getEstado());
            System.out.println("----------------------------");
        }
        panelCentro.removeAll();
        panelCentro.add(panels, BorderLayout.CENTER);
        panelCentro.revalidate(); // Refresh the panel
        panelCentro.repaint(); // Repaint the panel
    }
}
