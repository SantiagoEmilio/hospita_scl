package src.view;

import src.model.datapaciente;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class pacientesview extends JPanel {
    private ArrayList<datapaciente> listaPacientes;

    public pacientesview(ArrayList<datapaciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
        initPanel();
    }

    private void initPanel() {
        setLayout(new BorderLayout());

        // Título del panel
        JLabel titulo = new JLabel("Listado de pacientes", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);

        // Panel para mostrar los pacientes
        JPanel panelPacientes = new JPanel();
        panelPacientes.setLayout(new GridLayout(listaPacientes.size() + 1, 5)); // +1 for the header

        // Encabezado de la tabla
        panelPacientes.add(new JLabel("Nombre", SwingConstants.CENTER));
        panelPacientes.add(new JLabel("Zona", SwingConstants.CENTER));
        panelPacientes.add(new JLabel("Email", SwingConstants.CENTER));
        panelPacientes.add(new JLabel("Enfermedad", SwingConstants.CENTER));
        panelPacientes.add(new JLabel("Teléfono", SwingConstants.CENTER));

        // Agregar los pacientes al panel
        for (datapaciente paciente : listaPacientes) {
            panelPacientes.add(new JLabel(paciente.getNombre(), SwingConstants.CENTER));
            panelPacientes.add(new JLabel(paciente.getDireccion(), SwingConstants.CENTER));
            panelPacientes.add(new JLabel(paciente.getEmail(), SwingConstants.CENTER));
            panelPacientes.add(new JLabel(paciente.getMotivoconsulta(), SwingConstants.CENTER));
            panelPacientes.add(new JLabel(paciente.getTelefono(), SwingConstants.CENTER));
        }

        add(panelPacientes, BorderLayout.CENTER);
    }
}


