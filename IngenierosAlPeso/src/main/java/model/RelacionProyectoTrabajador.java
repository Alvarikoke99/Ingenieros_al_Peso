/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class RelacionProyectoTrabajador {
    private int idProyecto;
    private int idTrabajador;
/**
 * 
 */
    public int getIdProyecto() {
        return idProyecto;
    }
/**
 * 
 */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }
/**
 * 
 */
    public int getIdTrabajador() {
        return idTrabajador;
    }
/**
 * 
 */
    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
/**
 * 
 */
    @Override
    public String toString() {
        return "RelacionProyectoTrabajador{" + "idProyecto=" + idProyecto + ", idTrabajador=" + idTrabajador + '}';
    }
    
    
    
}
