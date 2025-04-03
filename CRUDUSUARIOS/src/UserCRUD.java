/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {

 
    
    private Connection conexion;
    public UserCRUD(){
        conexion=ConexionMySQL.conectar();
    }
    
    public boolean crearusuario(String nom,String cor,String contra){
        
            String sqlInsert="INSERT INTO usuarios(nombre,correo,contraseña)  VALUE(?,?,?)";
            
            try{
                PreparedStatement ps =conexion.prepareStatement(sqlInsert);
                ps.setString(1, nom);
                ps.setString(2,cor);
                ps.setString(3,contra);
                    return ps.executeUpdate()>0;
            }
            catch(SQLException e){
                System.out.println("ERROR al intentar insertar: " + e.getMessage());
                return false;
            }
    }//llave final
    
    public boolean eliminarusuario(int id){
        
        String sqlDelete="DELETE FROM usuarios WHERE id=?";
        
        
        try{
            PreparedStatement pa =conexion.prepareStatement(sqlDelete);
            pa.setInt(1,id);
            return pa.executeUpdate()>0;
        }
        catch(SQLException e){
            System.out.println("ERROR al intentar Consultar: " + e.getMessage());
                return false;
        }
        
    }
    
    public ResultSet obtenerUsuarioPorId(int id){
        String selectSql="SELECT * FROM usuarios WHERE id= ?";
        
        
        try{
           PreparedStatement ps=conexion.prepareStatement(selectSql);
                   ps.setInt(1,id);
                   return ps.executeQuery();
        }
        catch(SQLException e){ 
             System.out.println("ERROR al intentar Consultar: " + e.getMessage());
                return null;
        }
    }
    
    public void EditarUsuario(int id){
        String sqlUpdate="INSERT INTO usuarios(nombre,correo,contraseña)  VALUE(?,?,?) WHERE id =? ";
           try{
               
            PreparedStatement ps=conexion.prepareStatement(sqlUpdate);
            return;
        }
        catch(SQLException w){
            System.out.println("Error al consultar"+w.getMessage());
            return ;
        }
    }
    
    public ResultSet obtenertodos(){
        
        String sqlTodos="SELECT * FROM usuarios";
        
        try{
            PreparedStatement ps=conexion.prepareStatement(sqlTodos);
            return ps.executeQuery();
        }
        catch(SQLException w){
            System.out.println("Error al consultar"+w.getMessage());
            return null;
        }
    }
    
    
    
    
    
}
