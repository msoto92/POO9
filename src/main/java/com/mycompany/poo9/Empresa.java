/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo9;

/**
 *
 * @author Miguel
 */
public abstract class Empresa 
{
    protected String direccion;
    
    protected String nombre;
    
    protected int numeroTrabajadores;

    public Empresa(String direccion, int numeroTrabajadores,String nombre) {
        this.direccion = direccion;
        this.numeroTrabajadores = numeroTrabajadores;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }
    
    
    
}
