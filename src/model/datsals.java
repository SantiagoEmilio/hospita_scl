package model;

import java.util.ArrayList;

public class datsals {
private ArrayList<salas>listado;

public datsals(){
    listado=new ArrayList<>();
    listado.add(new salas("laboratorio", "Disponible"));
    listado.add(new salas("radiologia", "Fuera de servicio"));
    listado.add(new salas("hematologia", "En uso"));
    listado.add(new salas("farmacia", "Disponible"));
    listado.add(new salas("neonatologia", "En uso"));
    listado.add(new salas("oncologia", "Fuera de servicio"));
    listado.add(new salas("cardiologia", "Disponible"));
    listado.add(new salas
            ("traumatologia", "En uso"));
    listado.add(new salas("rehabilitacion", "Disponible"));
    listado.add(new salas("quimica clinica", "Fuera de servicio"));
    listado.add(new salas
            ("neumologia", "En uso"));
    listado.add(new salas("urologia", "Disponible"));
    listado.add(new salas("oftalmologia", "Fuera de servicio"));
    listado.add(new salas("dermatologia", "En uso"));
    listado.add(new salas("nutricion", "Disponible"));
    listado.add(new salas("psiquiatria", "Fuera de servicio"));
    listado.add(new salas("cirugia plastica", "En uso"));
    listado.add(new salas("fisioterapia", "Disponible"));
    listado.add(new salas("endoscopia", "Fuera de servicio"));
    listado.add(new salas("anestesiologia", "En uso"));

}
public ArrayList<salas>getListado(){
    return listado;
}
}
