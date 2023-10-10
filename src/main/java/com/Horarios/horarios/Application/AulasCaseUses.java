package com.Horarios.horarios.Application;

import com.Horarios.horarios.Domain.Aula;
import com.Horarios.horarios.Domain.AulasRepository;
import com.Horarios.horarios.Domain.Sesion;

import java.util.List;

public class AulasCaseUses {

    private AulasRepository aulasRepository;


    public AulasCaseUses(AulasRepository aulasRepository) {
        this.aulasRepository = aulasRepository;
    }

    public List<Aula> getAll(){
        return this.aulasRepository.getAll();
    }

    public List<Sesion> getSesionesFromAula(Aula aula){
        return this.getSesionesFromAula(aula);
    }
}
