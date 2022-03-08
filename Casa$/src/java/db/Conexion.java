/*
 Autor: Gamaliel Silva Lopez
 Fecha de creacion: 7 de marzo de 2022
 Fecha de modificacion: 8 de marzo de 2022
 Descripcion: Clase conexion
 */
package db;

import java.sql.*;

public class Conexion {

    Connection conexion;
    String url = "jdbc:postgresql://localhost/";
    String user = "postgrest";
    String password = "HOLA";

    public Conexion() {

    }

    public Conexion(Connection conexion, String url, String user, String password) {
        this.conexion = conexion;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void Conectar() {
        try {
            Class.forName("org.postgrest.Driver");
            conexion = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void Desconectar() {

    }

    public static void main(String[] args) {

    }

}
