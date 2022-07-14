/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo9;
import java.text.SimpleDateFormat;
import java.util.Date; 
import java.util.Locale;
/**
 *
 * @author Miguel
 */
public class POO9 {

    public static void main(String[] args) throws Exception
    {
        Banco banco = new Banco("Calle 52#70", 20, "Bancolombia");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Cliente cliente = new Cliente("Miguel", "Soto", "55555", sdf.parse("08/01/1992"));
        Cliente cliente2 = new Cliente("Carlos", "Varela", "55555", sdf.parse("08/01/2005"));
        
        banco.AgregarCliente(cliente);
        banco.AgregarCliente(cliente2);
        
        TarjetaCredito tarjeta = new TarjetaCredito(654,"07/25", "5456542351");
        TarjetaCredito tarjeta2 = new TarjetaCredito(655,"09/27", "4456542351");
        
        cliente.AgregarTarjeta(tarjeta);
        cliente2.AgregarTarjeta(tarjeta2);
        
        banco.AgregarTarjeta(tarjeta);
        banco.AgregarTarjeta(tarjeta2);
        
        String s = "";
        
        for (int i = 0; i < banco.getClientes().size(); i++) 
        {
            Cliente c = banco.getClientes().get(i);
            
            s = s + "El cliente con nombre: " + c.getNombre()+"\n Tiene las siguientes tarjetas: \n";
            
            for (TarjetaCredito t: c.getTarjetas()) 
            {
                s = s+ "- Tarjeta: " + t.getTipoTarjeta() + " Numero:  " + t.getNumeroTarjeta() + "Fecha vencimiento " + t.getFechaVencimiento() + "\n";
            }
            
        }
        
        System.out.println(s);
    }
}
