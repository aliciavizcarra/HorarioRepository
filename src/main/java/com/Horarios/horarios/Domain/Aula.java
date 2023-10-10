package com.Horarios.horarios.Domain;

public class Aula{

    private final String  nombre, responsable;

    private String materia;

    public Aula(String nombre, String responsable, String materia) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getMateria() {
        return materia;
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
