package model;

public class salas {
    private  String nombre;
    private String estado;


    public salas(String nombre, String estado){
        this.nombre=nombre;
        this.estado=estado;
    }

    public String getNombre(){return nombre;}
    public  String getEstado(){return estado;}

}
