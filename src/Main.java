import Backend.validacion;
import view.loginview;
import controller.LoginController;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
    loginview loginview=new loginview();
    validacion validacion=new validacion();
    new LoginController(loginview,validacion);
    loginview.setVisible(true);


    }
}






