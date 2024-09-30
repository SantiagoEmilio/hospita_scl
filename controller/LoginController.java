package controller;
import view.loginview;
public class LoginController {
    private loginview loginview;

    public LoginController(loginview loginview){
        this.loginview=loginview;
        initController();
    }
    public void initController() {
        loginview.getLoginButton().addActionListener(e -> iniciarsesion());
    }

    private void iniciarsesion() {
    }
}
