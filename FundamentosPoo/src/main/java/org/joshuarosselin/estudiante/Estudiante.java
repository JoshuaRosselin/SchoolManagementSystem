package org.joshuarosselin.estudiante;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String estado; // Matriculado, Inactivo, Graduado

    // Constructor
    public Estudiante(int id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
