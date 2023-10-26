/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.casos.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author mtorr
 */
public class Factura {
      
    //Variables
    private int numeroFactura;
    private int mesFactura;
    private int añoFactura;
    private double montoFactura;
    private int estadoFactura;

    //constructor 
    public Factura(String nombreCliente, int cedulaCliente, int numeroFactura, int mesFactura, int añoFactura, double montoFactura, int estadoFactura) {

        this.numeroFactura = numeroFactura;
        this.mesFactura = mesFactura;
        this.añoFactura = añoFactura;
        this.montoFactura = montoFactura;
        this.estadoFactura = estadoFactura;
    }
//Getters y Setters

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getMesFactura() {
        return mesFactura;
    }

    public void setMesFactura(int mesFactura) {
        this.mesFactura = mesFactura;
    }

    public int getAñoFactura() {
        return añoFactura;
    }

    public void setAñoFactura(int añoFactura) {
        this.añoFactura = añoFactura;
    }

    public double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(int estadoFactura) {
        this.estadoFactura = estadoFactura;
    }
}
