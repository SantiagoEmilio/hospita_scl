package src.model;

import java.util.ArrayList;
import java.util.List;

public class pacientedatabase {
    private List<datapaciente> pacientes;

    public pacientedatabase() {
        pacientes = new ArrayList<>();
        // Agrega los doctores de ejemplo
        pacientes.add(new datapaciente("zona 8 de mexico","jorge peres","rockemma","jfuentes@mail.com","12/2/2020","10:30","infeccion","2","24888991"));
        pacientes.add(new datapaciente("zona 4 de guatemala","maria lopez","mari_lopez","mlopez@mail.com","15/3/2020","11:00","fractura","1","25778891"));
        pacientes.add(new datapaciente("zona 6 de colombia","carlos gomez","carlito_123","cgomez@mail.com","25/4/2020","09:15","resfriado","3","21458792"));
        pacientes.add(new datapaciente("zona 2 de peru","ana flores","aflores87","aflores@mail.com","18/5/2020","08:45","alergia","1","23667892"));
        pacientes.add(new datapaciente("zona 10 de mexico","luis perez","luigi89","lperez@mail.com","22/6/2020","12:00","gripe","4","24877991"));
        pacientes.add(new datapaciente("zona 5 de chile","sofia rojas","sofi_rojas","srojas@mail.com","12/7/2020","13:45","diabetes","2","21688991"));
        pacientes.add(new datapaciente("zona 3 de argentina","juan martinez","jmartinez22","jmartinez@mail.com","30/8/2020","14:30","hipertension","3","24567991"));
        pacientes.add(new datapaciente("zona 1 de ecuador","paula diaz","paula_d","pdiaz@mail.com","10/9/2020","09:00","asma","2","23478991"));
        pacientes.add(new datapaciente("zona 9 de bolivia","fernando castro","fer_castro","fcastro@mail.com","15/10/2020","10:45","infeccion","1","21987991"));
        pacientes.add(new datapaciente("zona 7 de venezuela","marta sanchez","marta_s","msanchez@mail.com","18/11/2020","11:15","fractura","3","25888991"));
        pacientes.add(new datapaciente("zona 12 de mexico","roberto reyes","rreyes54","rreyes@mail.com","25/12/2020","08:30","dolor muscular","4","23978991"));
        pacientes.add(new datapaciente("zona 8 de honduras","esteban lopez","esteban_l","elopez@mail.com","2/1/2021","09:45","gripe","2","24899991"));
        pacientes.add(new datapaciente("zona 14 de mexico","maria juarez","mj_juarez","mjuarez@mail.com","14/2/2021","10:00","diabetes","3","24788991"));
        pacientes.add(new datapaciente("zona 11 de paraguay","pedro gomez","pgomez33","pgomez@mail.com","20/3/2021","12:45","hipertension","1","21588991"));
        pacientes.add(new datapaciente("zona 13 de costa rica","juana ortiz","juani_ortiz","jortiz@mail.com","5/4/2021","11:30","asma","4","23678991"));
        pacientes.add(new datapaciente("zona 6 de panama","carlos ruiz","carlos_rz","cruiz@mail.com","12/5/2021","09:30","infeccion","2","21788991"));
        pacientes.add(new datapaciente("zona 4 de el salvador","andres jimenez","andres_jm","ajimenez@mail.com","20/6/2021","14:00","fractura","3","24879991"));
        pacientes.add(new datapaciente("zona 15 de mexico","claudia fernandez","claudia_f","cfernandez@mail.com","10/7/2021","13:00","alergia","1","21478991"));
        pacientes.add(new datapaciente("zona 17 de mexico","felipe morales","felipe_m","fmorales@mail.com","22/8/2021","08:15","gripe","2","24578991"));
        pacientes.add(new datapaciente("zona 16 de guatemala","laura perez","laura_pz","lperez@mail.com","30/9/2021","09:30","diabetes","3","25877991"));


    }
    public  List<datapaciente>getPacientes(){
        return pacientes;
    }

}