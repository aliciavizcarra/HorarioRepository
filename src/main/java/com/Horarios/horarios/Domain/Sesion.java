package com.Horarios.horarios.Domain;

public class Sesion {

    private final String horaInicio, horaFin;

    private Integer id;

    public Sesion(String horaInicio, String horaFin, Integer id) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.id = id;
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
