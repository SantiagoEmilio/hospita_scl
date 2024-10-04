package model;

import java.util.ArrayList;
import java.util.List;

public class databasepaciente {
    private List<datapaciente>paciente;

    public databasepaciente(){
        paciente=new ArrayList<>();
        paciente.add(new datapaciente("zona 19 de brasil","alicia rodriguez","alicia_r","arodriguez@mail.com","22/10/2021","11:00","infeccion","2","23988993"));
        paciente.add(new datapaciente("zona 20 de uruguay","manuel herrera","manuel_h","mherrera@mail.com","5/11/2021","12:30","gripe","3","25888993"));
        paciente.add(new datapaciente("zona 21 de colombia","sofia mendez","sofi_m","smendez@mail.com","13/12/2021","09:15","fractura","1","24567992"));
        paciente.add(new datapaciente("zona 22 de chile","marcos diaz","marcos_d","mdiaz@mail.com","19/1/2022","08:45","asma","4","23688992"));
        paciente.add(new datapaciente("zona 23 de argentina","juliana vargas","julie_v","jvargas@mail.com","27/2/2022","10:30","diabetes","2","21998991"));
        paciente.add(new datapaciente("zona 24 de paraguay","gustavo torres","gus_t","gtorres@mail.com","15/3/2022","11:15","infeccion","3","21788993"));
        paciente.add(new datapaciente("zona 25 de bolivia","maria castillo","mari_c","mcastillo@mail.com","30/4/2022","12:45","dolor muscular","1","24888992"));
        paciente.add(new datapaciente("zona 26 de venezuela","francisco salazar","fran_s","fsalazar@mail.com","5/5/2022","14:00","gripe","2","23468992"));
        paciente.add(new datapaciente("zona 27 de ecuador","lucia perez","lucia_p","lperez@mail.com","18/6/2022","13:00","fractura","4","21458992"));
        paciente.add(new datapaciente("zona 28 de peru","juan carlos diaz","jc_diaz","jcdiaz@mail.com","22/7/2022","09:30","asma","3","23987991"));
        paciente.add(new datapaciente("zona 29 de honduras","elena moreno","elena_m","emoreno@mail.com","30/8/2022","10:45","alergia","2","25878991"));
        paciente.add(new datapaciente("zona 30 de mexico","rodrigo gonzalez","rod_gonz","rgonzalez@mail.com","12/9/2022","11:30","diabetes","1","24788994"));
        paciente.add(new datapaciente("zona 31 de guatemala","carolina montoya","caro_m","cmontoya@mail.com","25/10/2022","08:30","gripe","4","21688992"));
        paciente.add(new datapaciente("zona 32 de chile","nicolas vega","nico_v","nvega@mail.com","5/11/2022","13:45","infeccion","2","24578992"));
        paciente.add(new datapaciente("zona 33 de colombia","angela guerrero","angie_g","aguerrero@mail.com","18/12/2022","09:45","dolor muscular","3","25788991"));
        paciente.add(new datapaciente("zona 34 de argentina","hector ramirez","hector_r","hramirez@mail.com","30/1/2023","14:30","asma","1","24888994"));
        paciente.add(new datapaciente("zona 35 de paraguay","patricia lopez","patty_l","plopez@mail.com","12/2/2023","10:00","alergia","4","21478992"));
        paciente.add(new datapaciente("zona 36 de ecuador","fabian ruiz","fab_ruiz","fruiz@mail.com","20/3/2023","12:45","diabetes","2","23978992"));
        paciente.add(new datapaciente("zona 37 de bolivia","mariana ortiz","mariana_o","mortiz@mail.com","5/4/2023","09:00","infeccion","3","25867991"));
        paciente.add(new datapaciente("zona 38 de peru","sebastian flores","seb_flores","sflores@mail.com","15/5/2023","11:15","hipertension","1","21788994"));

    }
    public List<datapaciente>getPaciente(){
        return paciente;
    }
}
