package com.Horarios.horarios.Domain;

public class Sesion {

    private final String dia,horaInicio, horaFin;

    private Integer id;

    public Sesion(String dia,String horaInicio, String horaFin, Integer id) {
        this.dia=dia;
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
