package com.Horarios.horarios.Infraestructure.web;

import com.Horarios.horarios.Application.AulasCaseUses;
import com.Horarios.horarios.Infraestructure.data.AulasConexionSQL;
import com.Horarios.horarios.Infraestructure.data.AulasRepositorySQL;
import org.springframework.stereotype.Controller;


@Controller
public class HorarioController {
    private AulasCaseUses aulasCaseUses;

    public HorarioController(){
        this.aulasCaseUses=new AulasCaseUses(new AulasRepositorySQL());
    }

}
