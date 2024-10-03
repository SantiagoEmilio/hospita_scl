package src.view;


import javax.swing.*;
import java.awt.*;

public class loginview extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public loginview() {
        setTitle("Login");
        setSize(400, 300);  // Ajuste de tamaño a algo más razonable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar la ventana en la pantalla
        setLayout(new BorderLayout());

        // Panel principal que contiene los elementos del formulario
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.white);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Etiqueta de correo
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel emailLabel = new JLabel("Correo:");
        formPanel.add(emailLabel, gbc);

        // Campo de texto de correo
        gbc.gridx = 1;
        emailField = new JTextField(20);
        formPanel.add(emailField, gbc);

        // Etiqueta de contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel passwordLabel = new JLabel("Contraseña:");
        formPanel.add(passwordLabel, gbc);

        // Campo de texto de contraseña
        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        formPanel.add(passwordField, gbc);

        // Botón de inicio de sesión
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;  // Centrar el botón
        loginButton = new JButton("Iniciar Sesión");
        formPanel.add(loginButton, gbc);

        // Añadir el panel al centro de la ventana
        add(formPanel, BorderLayout.CENTER);
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }


}



