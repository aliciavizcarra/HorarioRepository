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
    public List<Sesion> getAll() {

        List<Sesion> list = new ArrayList<>();
        String consulta = "SELECT Materias.materia, Materias.aula , Sesiones.dia, Sesiones.sesion, Sesiones.horaInicio, Sesiones.horaFin FROM Materias JOIN Sesiones ON Materias.sesion=Sesiones.sesion";

        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(consulta);

            while(rs.next()){

                String materia = rs.getNString("materia");
                String aula = rs.getNString("aula");
                Integer sesion = rs.getInt("sesion");
                String dia= rs.getNString("dia");
                String horaInicio= rs.getNString("horaInicio");
                String horaFin=rs.getNString("horaFin");

                    list.add(new Sesion(aula,materia,sesion,dia,horaInicio,horaFin));
            }

            rs.close();
            stm.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    @Override
    public List<Sesion> getSesionesFromAula(String aula) {
        List<Sesion> lista=new ArrayList<>();
        String consultaBusqueda="SELECT Materias.aula, Materias.materia,Materias.sesion, Sesiones.dia, Sesiones.horaInicio, Sesiones.horaFin FROM Sesiones JOIN Materias ON Sesiones.sesion = Materias.sesion WHERE Materias.aula LIKE '"+ aula+"';";
        Connection connection=AulasConexionSQL.getCon();
            try{
                Statement stmt=connection.createStatement();
                ResultSet rs=stmt.executeQuery(consultaBusqueda);
                while (rs.next()){
                    String nombre=rs.getString(1);
                    String materia=rs.getString(2);
                    Integer sesion=rs.getInt(3);
                    String dia=rs.getString(4);
                    String horaInicio=rs.getString(5);
                    String horaFin=rs.getString(5);

                    lista.add(new Sesion(nombre,materia,sesion,dia,horaInicio,horaFin));


                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        return lista;
    }
}

