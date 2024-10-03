package src.model;

public class salas {
        private String nombre;
        private String estado;

        public salas (String nombre,String estado){
            this.nombre=nombre;
            this.estado=estado;
        }
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.estado=estado;
        }
        public String getEstado(){
            return estado;
        }
        public void setEstado(String estado){
            this.estado=estado;
        }
    }
