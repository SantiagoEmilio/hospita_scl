package src.model;

import java.util.ArrayList;
import java.util.List;

public class basedatosdoc {
        private List<datadoc> doctors;

        public basedatosdoc() {
            doctors = new ArrayList<>();
            // Agrega los doctores de ejemplo
            doctors.add(new datadoc("1", "Josue Fuentes", "Doctor General", "jfuentes@mail.com", "1234"));
            doctors.add(new datadoc("2", "k", "Cardiologo", "fgro@gmail.com", "1234"));
            doctors.add(new datadoc("3", "M", "Pediatra", "mnorg@gmail.com", "1234"));
        }

        public List<datadoc> getDoctors() {
            return doctors;
        }
    }

