package com.Horarios.horarios.Domain;

import java.util.List;

public interface AulasRepository {
    public List<Aula> getAll();

    public List<Sesion> getSesionesFromAula(Aula aula);

}
