package Controlador;

import Dto.PlantelDto;
import Modelo.Division;
import Modelo.Plantel;
import Modelo.Posicion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {

    private Connection C;
    private PreparedStatement PS;
    private Statement S;
    private ResultSet RS;

    public void abrirConexion() {
        try {
            String url = "jdbc:sqlserver://DESKTOP-E8FRIUV\\SQLEXPRESS:1433;databaseName=Futbol";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            C = DriverManager.getConnection(url, "sa", "giandjoe");
            System.out.println("Conectado a la BD");
        } catch (Exception e) {
            System.out.println("Error en la Conexión a la BD" + e.getMessage());
        }
    }

    public void cerrarConexion() {
        try {
            C.close();
            System.out.println("Desconectado de la BD");
        } catch (Exception e) {
            System.out.println("Error al desconectarse de la BD");
        }
    }
    public void agregarJugador(Plantel nuevoPlantel)
    {
        try {
            abrirConexion();
            PS=C.prepareStatement("INSERT INTO Plantel (numero, nombreJ, idP, idD, edad) VALUES (?,?,?,?,?)");
            
            PS.setInt(1, nuevoPlantel.getNumero());
            PS.setString(2, nuevoPlantel.getNombreJ());
            PS.setInt(3, nuevoPlantel.getIdP());
            PS.setInt(4, nuevoPlantel.getIdD());
            PS.setInt(5, nuevoPlantel.getEdad());
            
            PS.execute();
            
            PS.close();
            cerrarConexion();
            
        } catch (Exception e) {
        }
    }
    public ArrayList<Posicion>llenarComboP()
    {
        ArrayList<Posicion>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT * FROM Posicion");
            
            while(RS.next())
            {
                Posicion P=new Posicion();
                
                P.setIdP(RS.getInt(1));
                P.setNombreP(RS.getString(2));
                
                lista.add(P);
            }
            
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    public ArrayList<Division>llenarComboD()
    {
        ArrayList<Division>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT * FROM Division");
            
            while(RS.next())
            {
                Division D=new Division();
                
                D.setIdD(RS.getInt(1));
                D.setNombreD(RS.getString(2));
                
                lista.add(D);
            }
            
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int Reporte1()
    {
        int cantidad=0;
        
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT COUNT(*) FROM Plantel WHERE edad>=16 and edad<=19");
            
            RS.next();
            
            cantidad=RS.getInt(1);
            
        } catch (Exception e) {
        }
        return cantidad;
    }
    
    public float Reporte2()
    {
        int promedio=0;
        
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT AVG(edad) FROM Plantel");
            
            RS.next();
            
            promedio=RS.getInt(1);
            
        } catch (Exception e) {
        }
        return promedio;
    }
    public ArrayList<PlantelDto>reporte3()
    {
        ArrayList<PlantelDto>lista=new ArrayList<>();
        try {
            abrirConexion();
            S=C.createStatement();
            RS=S.executeQuery("SELECT p.numero, p.nombreJ, d.nombreD, p.edad FROM Plantel p INNER JOIN Division d ON p.idD=d.idD WHERE (p.idP=1) and (d.idD=2 or d.idD=3)");
            
            while(RS.next())
            {
                PlantelDto P=new PlantelDto();
                
                P.setNumero(RS.getInt(1));
                P.setNombre(RS.getString(2));
                P.setNombreD(RS.getString(3));
                P.setEdad(RS.getInt(4));
                
                lista.add(P);
            }
            RS.close();
            S.close();
            cerrarConexion();
        } catch (Exception e) {
        }
        return lista;
    }
}
