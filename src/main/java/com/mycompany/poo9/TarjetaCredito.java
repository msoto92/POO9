/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo9;

/**
 *
 * @author Miguel
 */
public class TarjetaCredito {
    private int  cvv;
    private String fechaVencimiento;
    private String numeroTarjeta;
    private String tipoTarjeta;

    public TarjetaCredito(int cvv, String fechaVencimiento, String numeroTarjeta) {
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
        this.numeroTarjeta = numeroTarjeta;
        String primerNumero = numeroTarjeta.toString().substring(0,1);
        
        if(primerNumero.equals("5"))
        {
            this.tipoTarjeta = "MasterCard";
        }
        else if(primerNumero.equals("4"))
        {
            this.tipoTarjeta = "Visa";
        }
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    
}
