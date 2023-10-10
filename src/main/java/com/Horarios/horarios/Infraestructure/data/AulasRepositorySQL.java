package com.Horarios.horarios.Infraestructure.data;

import com.Horarios.horarios.Domain.Aula;
import com.Horarios.horarios.Domain.AulasRepository;
import com.Horarios.horarios.Domain.Sesion;

import java.sql.Connection;
import java.util.List;

public class AulasRepositorySQL implements AulasRepository {

    @Override
    public List<Aula> getAll() {
        return null;
    }

    @Override
    public List<Sesion> getSesionesFromAula(Aula aula) {
        String consultaBusqueda="SELECT * FROM Sesiones JOIN Materias ON Sesiones.sesion = Materias.sesion";
        ;
        Connection connection=AulasConexionSQL.getCon();

        try{

        }
        return null;
    }
}
/*SELECT *
FROM sesiones
INNER JOIN seleccion ON sesiones.id_sesion = seleccion.id_sesion
WHERE sesiones.id_sesion = 'valor_de_la_sesion';
*/