package com.Horarios.horarios.Infraestructure.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AulasConexionSQL {
    private static Connection con;
    private static AulasConexionSQL aulasConexionSQL;

    public static Connection getCon(){
        try{
            con= DriverManager.getConnection("jdbc:mysql://database-2aurora.cluster-cnnmfywkx08i.us-west-2.rds.amazonaws.com/horario","admin","servidor");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return con;
    }
}
