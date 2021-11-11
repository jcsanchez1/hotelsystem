package hn.ceutec.vanguardia.configuracion;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Dba {

    private Connection conexion;
    public Statement query;
    private String user="VANGUARDIA";
    private String pass="0000";
    private CallableStatement cst;

    public static void main(String[] args) {
        Dba obconeccion = new Dba();
        obconeccion.Conectar();
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Dba Conectar() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
            
            //poner usuario y contraseña
            conexion = DriverManager.getConnection(BaseDeDatos, user, pass);
            query = conexion.createStatement();
            if (conexion != null) {
                System.out.println("Conexion exitosa ");
            } else {
                System.out.println("Conexion fallida");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return this;
    }

    public void desconectar() {
        try {
            query.close();
            conexion.close();
        } catch (Exception e) {
        }
    }

    public void commit() {
        try {
            conexion.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
