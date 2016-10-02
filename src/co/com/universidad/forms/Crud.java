/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.universidad.forms;

/**
 *
 * @author Administrador
 */
public abstract class Crud extends javax.swing.JFrame {
    public abstract boolean ValidarCampos();
    public abstract void Guardar();
    public abstract void Buscar();
    public abstract void Modificar();
    public abstract void Eliminar();
    public abstract void Limpiar();
    public abstract void CerrarS();
    public abstract void Cancelar();
}
