package com.Horarios.horarios.Domain;

public class Aula{

    private final String  nombre;

    private String materia;

    public Aula(String nombre,String materia) {
        this.nombre = nombre;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "nombre='" + nombre + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
