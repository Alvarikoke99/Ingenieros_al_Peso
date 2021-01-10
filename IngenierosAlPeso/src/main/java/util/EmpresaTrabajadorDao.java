/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author alvarikoke
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.RelacionEmpresaTrabajador;
import util.DbUtil;
import util.Log;

public class EmpresaTrabajadorDao {

    private Connection connection;

    public EmpresaTrabajadorDao() {
        connection = DbUtil.getConnection();
    }

    public void addRelacion(RelacionEmpresaTrabajador relacion) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into relacion_empresa_trabajador(id_trabajador, id_empresa, departamento) values (?, ?, ? )");
            // Parameters start with 1 
            preparedStatement.setInt(1, relacion.getIdTrabajador());
            preparedStatement.setInt(2, relacion.getIdEmpresa());            
            preparedStatement.setString(3, relacion.getDepartamento());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Log.logdb.error("SQL Exception: " + e);
        }
    }

    public void deleteRelacion(RelacionEmpresaTrabajador relacion) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from relacion_empresa_trabajador where id_trabajador=? and id_empresa=? and departamento=?");
            // Parameters start with 1 
            preparedStatement.setInt(1, relacion.getIdTrabajador());
            preparedStatement.setInt(2, relacion.getIdEmpresa());            
            preparedStatement.setString(3, relacion.getDepartamento());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Log.logdb.error("SQL Exception: " + e);
        }
    }

    public List<RelacionEmpresaTrabajador> getAllRelaciones() {
        List<RelacionEmpresaTrabajador> dbRelacion = new ArrayList<RelacionEmpresaTrabajador>();
        if (connection != null)
        {
            try {
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("select * from relacion_empresa_trabajador;");
                while (rs.next()) {
                    RelacionEmpresaTrabajador relacion = new RelacionEmpresaTrabajador();
                    relacion.setIdTrabajador(rs.getInt("id_trabajador"));
                    relacion.setIdEmpresa(rs.getInt("id_empresa"));
                    relacion.setDepartamento(rs.getString("departamento"));              
                    dbRelacion.add(relacion);
                }
            } catch (SQLException e) {
                Log.logdb.error("SQL Exception: " + e);            
            }
            return dbRelacion;
        }
        else
        {
            Log.logdb.error("No hay conexion con la bbdd");
            return null;
        }
       
    }

    public List<RelacionEmpresaTrabajador> getRelacionesByIdTrabajador(int idTrabajador) {
        List<RelacionEmpresaTrabajador> dbRelacion = new ArrayList<RelacionEmpresaTrabajador>();
        if (connection != null)
        {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from relacion_empresa_trabajador where id_trabajador=?;");
                // Parameters start with 1 
                preparedStatement.setInt(1, idTrabajador);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    RelacionEmpresaTrabajador relacion = new RelacionEmpresaTrabajador();
                    relacion.setIdTrabajador(rs.getInt("id_trabajador"));
                    relacion.setIdEmpresa(rs.getInt("id_empresa"));
                    relacion.setDepartamento(rs.getString("departamento"));              
                    dbRelacion.add(relacion);
                }
            } catch (SQLException e) {
                Log.logdb.error("SQL Exception: " + e);            
            }
            return dbRelacion;
        }
        else
        {
            Log.logdb.error("No hay conexion con la bbdd");
            return null;
        }
    }
    
    public List<RelacionEmpresaTrabajador> getRelacionesByIdEmpresa(int idEmpresa) {
        List<RelacionEmpresaTrabajador> dbRelacion = new ArrayList<RelacionEmpresaTrabajador>();
        if (connection != null)
        {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from relacion_empresa_trabajador where id_empresa=?;");
                // Parameters start with 1 
                preparedStatement.setInt(1, idEmpresa);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    RelacionEmpresaTrabajador relacion = new RelacionEmpresaTrabajador();
                    relacion.setIdTrabajador(rs.getInt("id_trabajador"));
                    relacion.setIdEmpresa(rs.getInt("id_empresa"));
                    relacion.setDepartamento(rs.getString("departamento"));              
                    dbRelacion.add(relacion);
                }
            } catch (SQLException e) {
                Log.logdb.error("SQL Exception: " + e);            
            }
            return dbRelacion;
        }
        else
        {
            Log.logdb.error("No hay conexion con la bbdd");
            return null;
        }
    }
    
    public List<RelacionEmpresaTrabajador> getRelacionesById(int idTrabajador, int idEmpresa) {
        List<RelacionEmpresaTrabajador> dbRelacion = new ArrayList<RelacionEmpresaTrabajador>();
        if (connection != null)
        {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("select * from relacion_empresa_trabajador where id_trabajador=? and id_empresa=?;");
                // Parameters start with 1 
                preparedStatement.setInt(1, idTrabajador);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    RelacionEmpresaTrabajador relacion = new RelacionEmpresaTrabajador();
                    relacion.setIdTrabajador(rs.getInt("id_trabajador"));
                    relacion.setIdEmpresa(rs.getInt("id_empresa"));
                    relacion.setDepartamento(rs.getString("departamento"));              
                    dbRelacion.add(relacion);
                }
            } catch (SQLException e) {
                Log.logdb.error("SQL Exception: " + e);            
            }
            return dbRelacion;
        }
        else
        {
            Log.logdb.error("No hay conexion con la bbdd");
            return null;
        }
    }
}
