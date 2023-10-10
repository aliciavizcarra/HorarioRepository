package com.Horarios.horarios.Domain;

public class Aula{

    private final String  nombre, responsable;

    private String aula;

    public Aula(String nombre, String responsable, String aula) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getAula() {
        return aula;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "nombre='" + nombre + '\'' +
                ", responsable='" + responsable + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
