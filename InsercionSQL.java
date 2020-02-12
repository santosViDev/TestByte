/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaSQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class InsercionSQL {
    public static String url = "jdbc:mysql://localhost:3306/empresa";
    public static String usuario="root";
    public static String pwd="root";
    
    public static void main(String[] args) {
        Connection con;
        PreparedStatement ps;
        ResultSet res;
        String sentenciaSQL;
        sentenciaSQL="INSERT INTO tblempresa (nombre, nit, fechaFundacion, direccion) values ('Compañía de Seguro','0209-250698-254-6','1998-06-25','Colonia Escalon')";
        
        try {
            con=obtenerConexion();
            ps = con.prepareStatement(sentenciaSQL);
            ps.executeUpdate(sentenciaSQL);//le resta res=
            
            /*if (res.next()){
                System.out.println(res.getInt("id")+" "+res.getString("nombre")+" "+res.getString("nit")+" "+res.getDate("fechaFundacion")+" "+res.getString("direccion"));
            }else{
                System.out.println("No existen datos");
            }*/
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static Connection obtenerConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, pwd);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Excepción en el método: "+e);
        }
        return con;
    }
}
