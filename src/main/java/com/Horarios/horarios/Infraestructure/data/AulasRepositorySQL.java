package com.Horarios.horarios.Infraestructure.data;

import com.Horarios.horarios.Domain.Aula;
import com.Horarios.horarios.Domain.AulasRepository;
import com.Horarios.horarios.Domain.Sesion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AulasRepositorySQL implements AulasRepository {

    Connection con = AulasConexionSQL.getCon();
    @Override
    public List<Aula> getAll() {

        List<Aula> list = new ArrayList<>();
        String consulta = "SELECT * FROM Materias JOIN Sesiones";

        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(consulta);

            while(rs.next()){

                String materia = rs.getNString("matricula");
                String responsable = rs.getNString("responsable");
                String aula = rs.getNString("aula");
                String sesion = rs.getNString("sesion");
                String dia= rs.getNString("dia");

            }




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }

    @Override
    public List<Sesion> getSesionesFromAula(Aula aula) {
        return null;
    }
}
