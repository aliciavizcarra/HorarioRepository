package com.Horarios.horarios.Infraestructure.data;

import com.Horarios.horarios.Domain.Aula;
import com.Horarios.horarios.Domain.AulasRepository;
import com.Horarios.horarios.Domain.Sesion;

import java.util.List;

public class AulasRepositorySQL implements AulasRepository {

    @Override
    public List<Aula> getAll() {
        return null;
    }

    @Override
    public List<Sesion> getSesionesFromAula(Aula aula) {
        return null;
    }
}
