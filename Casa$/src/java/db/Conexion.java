/*
 Autor: Gamaliel Silva Lopez
 Fecha de creacion: 7 de marzo de 2022
 Fecha de modificacion: 9 de marzo de 2022
 Descripcion: Clase conexion
 */
package db;

import java.sql.*;

public class Conexion {

    static Connection conexion;
    String url = "jdbc:postgresql://localhost/casas";
    String user = "postgres";
    String password = "HOLA";

    public Conexion() {

    }

    public Conexion(Connection conexion, String url, String user, String password) {
        this.conexion = conexion;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection Conectar() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url,user,password);
            System.out.println("Conexion con exito");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return con;
    }

    public void Desconectar() {
        try {
            conexion.close();
            System.out.println("Conexion cerrada");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {

        Conexion con = new Conexion();
        con.Conectar();
        con.Desconectar();
//        try{
//          
//            String sql="select * from casas";
//             ResultSet rs;
//             Statement st= con.createStatement();
//             rs=st.executeQuery(sql);
//             while(rs.next()){
//                 System.out.println(rs.getObject("codigo"));
//                 System.out.println(rs.getObject("nombre"));
//                 System.out.println(rs.getObject("descripcion"));
//                 System.out.println(rs.getObject("precio"));
//                 System.out.println(rs.getObject("FechaCreacion"));
//                 System.out.println(rs.getObject("FechaActualizacion"));
//                 System.out.println(rs.getObject("FechaEliminacion"));
//                 
//                 
//             }
//             
//        }catch(Exception e){
//            System.out.println(e.toString());
//        }
    }

}
