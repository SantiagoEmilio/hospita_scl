package src.model;
import java.util.ArrayList;
import java.util.List;
public class datapaciente {

        private String telefono;
        private String nombre;
        private String direccion;
        private String email;
        private String fechanacimiento;

        private String horariocita;

        private String motivoconsulta;

        private String numerodevisitas;
        private String doctor;
        // Constructor
        public datapaciente(String direccion, String nombre, String doctor, String email, String fechanacimiento,String horariocita,String motivoconsulta,String numerodevisitas,String telefono) {
            this.nombre = nombre;
            this.email = email;
            this.direccion=direccion;
            this.doctor=doctor;
            this.telefono=telefono;
            this.fechanacimiento=fechanacimiento;
            this.horariocita=horariocita;
            this.motivoconsulta=motivoconsulta;

        }

        // Getters y Setters
        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getMotivoconsulta() {
            return motivoconsulta;
        }

        public void setDireccion(String direccion) {
            this.direccion= direccion;
        }

        public String getNumerodevisitas() {
            return numerodevisitas;
        }

        public void setNumerodevisitasl(String numerodevisitas) {
            this.numerodevisitas = numerodevisitas;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setdireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getHorariocita() {
            return horariocita;
        }

        public void setHorariocita(String horariocita) {
            this.horariocita = horariocita;
        }

        public String getFechanacimiento() {
            return fechanacimiento;
        }

        public void setFechanacimiento(String fechanacimiento) {
            this.fechanacimiento = fechanacimiento;
        }
        public String getnumerodevisitas() {
            return numerodevisitas;
        }

        public void setNumerodevisitas(String numerodevisitas) {
            this.numerodevisitas = numerodevisitas;
        }

        public String getDoctor() {
            return doctor;
        }

        public void setDoctor(String doctor) {
            this.doctor = doctor;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Paciente: " + nombre + ", Doctor: " + doctor + ", Motivo de Visita: " + motivoconsulta +
                    ", Fecha de Nacimiento: " + fechanacimiento+ ", Hora de Cita: " + horariocita +
                    ", Número de Consultas: " + numerodevisitas;
        }
    }

