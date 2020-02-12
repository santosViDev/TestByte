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
public class ModificarRegistroSQL {
        public static String url = "jdbc:mysql://localhost:3306/empresa";
    public static String usuario="root";
    public static String pwd="root";
    
    public static void main(String[] args) {
        Connection con;
        PreparedStatement ps;
        ResultSet res;
        String sentenciaSQL;
        sentenciaSQL="UPDATE tblempresa SET fechaFundacion ='1978-06-25' WHERE id = '1'";
        
        try {
            con=obtenerConexion();
            ps = con.prepareStatement(sentenciaSQL);
            ps.executeUpdate(sentenciaSQL);
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
