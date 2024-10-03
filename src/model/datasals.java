package src.model;

import java.util.ArrayList;

public class datasals {
    private String nombre;
    private String estado;
    private static ArrayList<datasals> listasalas;

    // Constructor para crear objetos de tipo 'datasals' con nombre y estado
    public datasals(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    // Constructor que inicializa la lista de salas
    public datasals() {
        listasalas = new ArrayList<>();
        listasalas.add(new datasals("quirofano", "En uso"));
        listasalas.add(new datasals("pediatria", "Disponible"));
        listasalas.add(new datasals("emergencias", "Fuera de servicio"));
        listasalas.add(new datasals("urgencias", "En uso"));
        listasalas.add(new datasals("sala de espera", "Disponible"));
        listasalas.add(new datasals("ginecologia", "Fuera de servicio"));
        listasalas.add(new datasals("odontologia", "En uso"));
        listasalas.add(new datasals("sala de espera", "Disponible"));
        listasalas.add(new datasals("neurología", "Fuera de servicio"));  // Corrección de 'neoruologia'
        listasalas.add(new datasals("morgue", "Disponible"));  // Corrección de 'morge'
        listasalas.add(new datasals("camillas", "En uso"));
        listasalas.add(new datasals("pre operación", "Disponible"));  // Corrección de 'pre operacion'
    }

    // Método para obtener la lista de salas
    public static ArrayList<datasals> getListasalas() {
        return listasalas;
    }

    // Getters para nombre y estado
    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }
}
