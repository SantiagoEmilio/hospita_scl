package src.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import src.model.medicamento;
public class dataFarmacia {
    private List<medicamento> medicamentos;

    public dataFarmacia() {
        medicamentos = new ArrayList<>();
        agregarmedicamento();
    }

    private void agregarmedicamento() {
        medicamentos.add(new medicamento(
                "Medicamento 1", "Jarabe", "20ml", "Principio Activo 1",
                LocalDate.now().plusYears(2), "Lote1", 15.00, "Indicaciones 1", "Contraindicaciones 1"));
        medicamentos.add(new medicamento(
                "Medicamento 2", "Jarabe", "20ml", "Principio Activo 2",
                LocalDate.now().plusYears(2), "Lote2", 15.00, "Indicaciones 2", "Contraindicaciones 2"));
        medicamentos.add(new medicamento(
                "Medicamento 3", "Inyección", "5ml", "Principio Activo 3",
                LocalDate.now().plusYears(2), "Lote3", 25.00, "Indicaciones 3", "Contraindicaciones 3"));
        medicamentos.add(new medicamento(
                "Medicamento 4", "Tableta", "50mg", "Principio Activo 4",
                LocalDate.now().plusYears(2), "Lote4", 12.00, "Indicaciones 4", "Contraindicaciones 4"));
        medicamentos.add(new medicamento(
                "Medicamento 5", "Crema", "15g", "Principio Activo 5",
                LocalDate.now().plusYears(2), "Lote5", 30.00, "Indicaciones 5", "Contraindicaciones 5"));
        medicamentos.add(new medicamento(
                "Medicamento 1", "Jarabe", "20ml", "Principio Activo 1",
                LocalDate.now().plusYears(2), "Lote1", 15.00, "Indicaciones 1", "Contraindicaciones 1"));
        medicamentos.add(new medicamento(
                "Medicamento 2", "Jarabe", "20ml", "Principio Activo 2",
                LocalDate.now().plusYears(2), "Lote2", 15.00, "Indicaciones 2", "Contraindicaciones 2"));
        medicamentos.add(new medicamento(
                "Medicamento 3", "Inyección", "5ml", "Principio Activo 3",
                LocalDate.now().plusYears(2), "Lote3", 25.00, "Indicaciones 3", "Contraindicaciones 3"));
        medicamentos.add(new medicamento(
                "Medicamento 4", "Tableta", "50mg", "Principio Activo 4",
                LocalDate.now().plusYears(2), "Lote4", 12.00, "Indicaciones 4", "Contraindicaciones 4"));
        medicamentos.add(new medicamento(
                "Medicamento 5", "Crema", "15g", "Principio Activo 5",
                LocalDate.now().plusYears(2), "Lote5", 30.00, "Indicaciones 5", "Contraindicaciones 5"));
        medicamentos.add(new medicamento(
                "Medicamento 1", "Jarabe", "20ml", "Principio Activo 1",
                LocalDate.now().plusYears(2), "Lote1", 15.00, "Indicaciones 1", "Contraindicaciones 1"));
        medicamentos.add(new medicamento(
                "Medicamento 2", "Jarabe", "20ml", "Principio Activo 2",
                LocalDate.now().plusYears(2), "Lote2", 15.00, "Indicaciones 2", "Contraindicaciones 2"));
        medicamentos.add(new medicamento(
                "Medicamento 3", "Inyección", "5ml", "Principio Activo 3",
                LocalDate.now().plusYears(2), "Lote3", 25.00, "Indicaciones 3", "Contraindicaciones 3"));
        medicamentos.add(new medicamento(
                "Medicamento 4", "Tableta", "50mg", "Principio Activo 4",
                LocalDate.now().plusYears(2), "Lote4", 12.00, "Indicaciones 4", "Contraindicaciones 4"));
        medicamentos.add(new medicamento(
                "Medicamento 5", "Crema", "15g", "Principio Activo 5",
                LocalDate.now().plusYears(2), "Lote5", 30.00, "Indicaciones 5", "Contraindicaciones 5"));
        medicamentos.add(new medicamento(
                "Medicamento 1", "Jarabe", "20ml", "Principio Activo 1",
                LocalDate.now().plusYears(2), "Lote1", 15.00, "Indicaciones 1", "Contraindicaciones 1"));
        medicamentos.add(new medicamento(
                "Medicamento 2", "Jarabe", "20ml", "Principio Activo 2",
                LocalDate.now().plusYears(2), "Lote2", 15.00, "Indicaciones 2", "Contraindicaciones 2"));
        medicamentos.add(new medicamento(
                "Medicamento 3", "Inyección", "5ml", "Principio Activo 3",
                LocalDate.now().plusYears(2), "Lote3", 25.00, "Indicaciones 3", "Contraindicaciones 3"));
        medicamentos.add(new medicamento(
                "Medicamento 4", "Tableta", "50mg", "Principio Activo 4",
                LocalDate.now().plusYears(2), "Lote4", 12.00, "Indicaciones 4", "Contraindicaciones 4"));
        medicamentos.add(new medicamento(
                "Medicamento 5", "Crema", "15g", "Principio Activo 5",
                LocalDate.now().plusYears(2), "Lote5", 30.00, "Indicaciones 5", "Contraindicaciones 5"));
        medicamentos.add(new medicamento(
                "Medicamento 1", "Jarabe", "20ml", "Principio Activo 1",
                LocalDate.now().plusYears(2), "Lote1", 15.00, "Indicaciones 1", "Contraindicaciones 1"));
        medicamentos.add(new medicamento(
                "Medicamento 2", "Jarabe", "20ml", "Principio Activo 2",
                LocalDate.now().plusYears(2), "Lote2", 15.00, "Indicaciones 2", "Contraindicaciones 2"));
        medicamentos.add(new medicamento(
                "Medicamento 3", "Inyección", "5ml", "Principio Activo 3",
                LocalDate.now().plusYears(2), "Lote3", 25.00, "Indicaciones 3", "Contraindicaciones 3"));
        medicamentos.add(new medicamento(
                "Medicamento 4", "Tableta", "50mg", "Principio Activo 4",
                LocalDate.now().plusYears(2), "Lote4", 12.00, "Indicaciones 4", "Contraindicaciones 4"));
        medicamentos.add(new medicamento(
                "Medicamento 5", "Crema", "15g", "Principio Activo 5",
                LocalDate.now().plusYears(2), "Lote5", 30.00, "Indicaciones 5", "Contraindicaciones 5"));
        // Agrega más medicamentos según sea necesario...

    }

    public List<medicamento> getmedicamentos() {
        return new ArrayList<>(medicamentos); // Devuelve una copia de la lista de medicamentos
    }
}