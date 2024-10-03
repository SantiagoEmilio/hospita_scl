package src.model;
import java.time.LocalDate;

import java.time.LocalDate;

public class medicamento {
    private String nombre;
    private String formafarmaceutica;
    private String dosis;
    private String principioactivo;
    private LocalDate fechacaducidad;
    private  String numerodelote;
    private double precio;
    private String indicaciones;
    private String contraindicaciones;

    public medicamento(String nombre, String formaFarmaceutica, String dosis, String principioActivo, LocalDate fechaCaducidad, String numeroLote, double precio, String indicaciones, String contraindicaciones) {
        this.nombre=nombre;
        this.formafarmaceutica=formaFarmaceutica;
        this.dosis = dosis;
        this.principioactivo = principioActivo;
        this.fechacaducidad = fechaCaducidad;
        this.numerodelote = numeroLote;
        this.precio = precio;
        this.indicaciones = indicaciones;
        this.contraindicaciones = contraindicaciones;
    }
    public String getNombre(){return nombre;}

    public void setNombre(String nombre){this.nombre=nombre;}

    public String getFormaFarmaceutica() {
        return formafarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formafarmaceutica= formaFarmaceutica;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getPrincipioActivo() {
        return principioactivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioactivo= principioActivo;
    }

    public LocalDate getFechaCaducidad() {
        return fechacaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechacaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return numerodelote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numerodelote = numeroLote;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }
}