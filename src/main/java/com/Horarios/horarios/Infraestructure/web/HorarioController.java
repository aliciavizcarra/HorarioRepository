package com.Horarios.horarios.Infraestructure.web;

import com.Horarios.horarios.Application.AulasCaseUses;
import com.Horarios.horarios.Domain.Sesion;
import com.Horarios.horarios.Infraestructure.data.AulasConexionSQL;
import com.Horarios.horarios.Infraestructure.data.AulasRepositorySQL;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class HorarioController {
    private AulasCaseUses aulasCaseUses;

    public HorarioController(){
        this.aulasCaseUses=new AulasCaseUses(new AulasRepositorySQL());
    }

    @RequestMapping("/horario")
        String horario(Model model){
            List<Sesion> list = this.aulasCaseUses.getAll();
            model.addAttribute("list",list);
            return "horario";
        }


    @PostMapping("/horarioEspecifico")
        String horarioEspecifico(Model model, @RequestParam (name = "nombre") String nombre){
        List<Sesion> listaEspecifica=this.aulasCaseUses.getSesionesFromAula(nombre);

        model.addAttribute("horarioEspecifico", listaEspecifica);
        return "horarioEspecifico";
    }

}
