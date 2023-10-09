package com.Horarios.horarios.Domain;

public class Aula{

    private final String  nombre, responsable;

    private String aula;

    public Materia(String nombre, String responsable, String aula) {
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
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", responsable='" + responsable + '\'' +
                ", aula='" + aula + '\'' +
                '}';
    }
}
