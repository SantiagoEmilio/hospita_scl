package Backend;
import model.basedatosdoc;
import model.datadoc;
import java.util.HashMap;

public class validacion {
    private basedatosdoc basedatosdoc;

public validacion(){basedatosdoc=new basedatosdoc();}
    public HashMap<String,String>validacionar(String email,String password){
    HashMap<String,String>respuesta=new HashMap<>();

    for (datadoc doctor:basedatosdoc.getDoctors()){
        if (doctor.getEmail().equals(email)&&doctor.getPassword().equals(password)){
            respuesta.put("usuario",doctor.getNombre());
            respuesta.put("password",doctor.getEspecialidad());
            break;
        }
    }
    return respuesta;
    }
}
