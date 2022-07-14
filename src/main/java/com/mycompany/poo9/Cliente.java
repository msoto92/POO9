/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo9;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Miguel
 */
public class Cliente 
{
    private String nombre;
    private String apellido;
    private String documento;
    private Date fechaNacimiento;
    private List<TarjetaCredito> tarjetas;

    public Cliente(String nombre, String apellido, String documento, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.tarjetas = new ArrayList<TarjetaCredito>();
    }
    
    public List<TarjetaCredito> getTarjetas()
    {
        return tarjetas;
    }

    public void AgregarTarjeta(TarjetaCredito tarjeta)
    {
        tarjetas.add(tarjeta);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
