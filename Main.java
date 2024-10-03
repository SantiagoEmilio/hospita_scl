import src.Backend.validacion;
import src.controller.Logincontroller;
import src.view.Doctorview;
import src.view.loginview;

public class Main {
    public static void main(String[] args) {

        loginview loginView = new loginview();


        validacion validacionDatodds = new validacion();

        new Logincontroller(loginView, validacionDatodds);
        loginView.setVisible(true);
    }}







