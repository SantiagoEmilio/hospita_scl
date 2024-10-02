package model;
import java.util.ArrayList;
import java.util.List;
public class datadoc {

        private String num;
        private String nombre;
        private String especialidad;
        private String email;
        private String password;

        // Constructor
        public datadoc(String num, String nombre, String especialidad, String email, String password) {
            this.num = num;
            this.nombre = nombre;
            this.especialidad = especialidad;
            this.email = email;
            this.password = password;
        }

        // Getters y Setters
        public String getId() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void spetEsecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }




    }

