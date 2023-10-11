package com.Horarios.horarios.Domain;

import java.util.List;

public interface AulasRepository {
    public List<Sesion> getAll();

    public List<Sesion> getSesionesFromAula(Aula aula);

}
