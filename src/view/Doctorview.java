package src.view;

import src.model.medicamento;
import src.model.dataFarmacia;
import src.model.datapaciente;
import src.model.datasals;
import src.model.pacientedatabase;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Doctorview extends JFrame {

    private JLabel nombreDoctorLabel;
    private JLabel especialidadLabel;
    private ArrayList<datasals> listasalas;
    private ArrayList<medicamento> listamedicamentos;
    private int[] pantalla = {1300, 800};
    private JPanel panelCentro; // Definir el panelCentro aquí

    // Constructor que recibe el nombre del doctor y su especialidad
    public Doctorview(String nombreDoctor, String especialidad) {
        // Configuración básica del JFrame con dimensiones desde el atributo pantalla
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

        // Crear un panel para el nombre del doctor y su especialidad (al lado derecho)
        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new GridLayout(2, 1));  // 2 filas, 1 columna
        doctorInfoPanel.setBackground(Color.DARK_GRAY);

        // Etiquetas para el nombre y especialidad del doctor
        nombreDoctorLabel = new JLabel("Nombre del doctor: " + nombreDoctor);
        nombreDoctorLabel.setForeground(Color.WHITE);
        especialidadLabel = new JLabel("Especialidad: " + especialidad);
        especialidadLabel.setForeground(Color.WHITE);

        // Inicializar salas y medicamentos
        datasals datasalas = new datasals();
        listasalas = datasalas.getListasalas();

        dataFarmacia datafarmacia = new dataFarmacia();
        listamedicamentos = (ArrayList<medicamento>) datafarmacia.getmedicamentos();

        doctorInfoPanel.add(nombreDoctorLabel);
        doctorInfoPanel.add(especialidadLabel);

        // Añadir el panel con la información del doctor al lado derecho
        headerPanel.add(doctorInfoPanel, BorderLayout.EAST); // Asegúrate de añadir el panel de info al header

        // Panel central
        panelCentro = new JPanel(); // Inicializa panelCentro
        panelCentro.setLayout(new BorderLayout());

        // Panel para la representación del usuario (userPanel)
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());

        // Añadir el panel de usuario al centro
        add(panelCentro, BorderLayout.CENTER);
        add(headerPanel, BorderLayout.NORTH);
        add(componentesmenulateral(), BorderLayout.WEST);
    }

    public Doctorview() {

    }

    private JPanel componentesmenulateral() {
        JPanel menu = new JPanel();
        menu.setPreferredSize(new Dimension(250, pantalla[1]));
        menu.setBackground(Color.darkGray);
        menu.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        JPanel opciones = new JPanel();
        opciones.setLayout(new GridLayout(0, 1, 10, 10));

        // Agregamos las opciones del menú con sus acciones
        opciones.add(op("Consultas del día"));
        opciones.add(op("Salas"));
        opciones.add(op("Farmacia"));
        opciones.add(op("Pacientes registrados"));
        opciones.add(op("Citar en otra área"));

        menu.add(opciones);
        return menu;
    }

    private JButton op(String texto) {
        JButton op = new JButton(texto);
        op.addActionListener(e -> {
            System.out.println(texto);
        });
        return op;
    }

    private void mostrarPacientes(pacientedatabase db) {
        ArrayList<datapaciente> listaPacientes = new ArrayList<>(db.getPacientes());
        pacientesview panelPacientes = new pacientesview(listaPacientes);

        panelCentro.removeAll();
        panelCentro.add(panelPacientes, BorderLayout.CENTER);

        revalidate();
        repaint();
    }

    private void mostrarmedicamentos() {
        JPanel panelMedicamentos = new JPanel();
        panelMedicamentos.setLayout(new GridLayout(0, 7, 10, 10));

        // Añadir títulos de las columnas
        panelMedicamentos.add(new JLabel("Nombre"));
        panelMedicamentos.add(new JLabel("Dosis"));
        panelMedicamentos.add(new JLabel("Número de Lote"));
        panelMedicamentos.add(new JLabel("Principio Activo"));
        panelMedicamentos.add(new JLabel("Forma Farmacéutica"));
        panelMedicamentos.add(new JLabel("Indicaciones"));
        panelMedicamentos.add(new JLabel("Fecha de Caducidad"));

        // Ahora añadimos los datos de cada medicamento
        for (medicamento med : listamedicamentos) {
            panelMedicamentos.add(new JLabel(med.getNombre()));
            panelMedicamentos.add(new JLabel(med.getDosis()));
            panelMedicamentos.add(new JLabel(med.getNumeroLote()));
            panelMedicamentos.add(new JLabel(med.getPrincipioActivo()));
            panelMedicamentos.add(new JLabel(med.getFormaFarmaceutica()));
            panelMedicamentos.add(new JLabel(med.getIndicaciones()));
            panelMedicamentos.add(new JLabel(med.getFechaCaducidad().toString())); // Si es de tipo Date o LocalDate
        }

        panelCentro.removeAll();
        panelCentro.add(panelMedicamentos, BorderLayout.CENTER);

        revalidate();
        repaint();
    }

    // Agregar un método para mostrar salas si es necesario
    private void mostrarSalas() {
        // Implementa la lógica para mostrar salas
    }
}
