package com.Horarios.horarios.Domain;

public class Sesion extends Aula{

    private final String dia,horaInicio, horaFin;

    private Integer id;

    public Sesion(String nombre, String materia,Integer id, String dia, String horaInicio, String horaFin) {
        super(nombre, materia);
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.id = id;
    }


    public String getDia() {
        return dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public Integer getId() {
        return id;
    }
}
