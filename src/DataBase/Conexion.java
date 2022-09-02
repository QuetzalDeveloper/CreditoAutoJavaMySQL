package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection conexion;
    private Statement consulta;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String baseDatos = "jdbc:mysql://localhost:3306/texcoplan"; //192.168.1.64
    private static String usuario = "root";
    private static String password = "";
    ResultSet res = null;
    
    public void Conectar(String usuario, String password){
        try{
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Conexion fallida");
        }
        try{
            conexion = DriverManager.getConnection(baseDatos,usuario, password); //192.168.1.64
            consulta = conexion.createStatement();
            System.out.println("Conexion iniciada");
        } catch (SQLException ex) {
            System.out.println("Error -- "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión.\n- "
                    + "Verifique su cuenta y contraseña o la conexión al servidor",
                    "Error al iniciar sesión", JOptionPane.ERROR_MESSAGE);    
        }
    }
    
    public synchronized int Modificar(String sql){
        try{
            consulta.executeUpdate(sql);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar\n--"
                    +e.getMessage(),"Error al actualizar", JOptionPane.ERROR_MESSAGE); 
        }
        return 0;       
    }
    
    public ResultSet Consulta(String sql){
        try {
            consulta=conexion.createStatement();
            res = consulta.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error "
                    + "al consultar -- "+e.getMessage());
        }
        return res;
    }
       
    public void Cerrar(){
         try {
             conexion.close();
             System.out.println("Conexion finalizada");
         } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName())
                     .log(Level.SEVERE, null, ex);
         }
    }
}
