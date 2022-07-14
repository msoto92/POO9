/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Banco extends Empresa{

    private List<TarjetaCredito> tarjetas;
    private List<Cliente> clientes;
    
    public Banco(String direccion, int numeroTrabajadores, String nombre) {
        super(direccion, numeroTrabajadores, nombre);
        tarjetas = new ArrayList<TarjetaCredito>();
        clientes = new ArrayList<Cliente>();
    }
    
    public List<TarjetaCredito> getTarjetas()
    {
        return tarjetas;
    }
    
     public List<Cliente> getClientes()
    {
        return clientes;
    }
    
     
    public void AgregarTarjeta(TarjetaCredito t)
    {
        tarjetas.add(t);
    }
    
    public void AgregarCliente(Cliente c)
    {
        clientes.add(c);
    }
    
}
