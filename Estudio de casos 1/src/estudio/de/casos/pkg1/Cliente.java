/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.de.casos.pkg1;

/**
 *
 * @author mtorr
 */
public class Cliente {
    private int cedulaCliente;
    private String nombreCliente;
    private double deudaTotal;
     public Cliente(int cedulaCliente, String nombreCliente) {
        this.cedulaCliente = cedulaCliente;
        this.nombreCliente = nombreCliente;
        this.deudaTotal = 0.0;
    }

    public void agregarFactura(int numeroFactura, int mesFactura, int añoFactura, double montoFactura, int estadoFactura) {
        if (estadoFactura == 2) {
            deudaTotal += montoFactura;
        }
    }

    public double calcularDeudaTotal() {
        return deudaTotal;
    }

    public void generarPlanPago(int meses) {
        double interes = deudaTotal * 0.05;
        double cuotaMensual = (interes + deudaTotal) / meses;

        System.out.println("Plan de Pago para " + nombreCliente + " Cedula: " + cedulaCliente );
        for (int i = 1; i <= meses; i++) {
            System.out.println("Cuota " + i + ": " + cuotaMensual + " Fecha de Pago: " + obtenerFechaPago(i));
        }
    }

    private String obtenerFechaPago(int cuota) {
        int mesFactura = 1; 
        int añoFactura = 2023;
        int mes = mesFactura + cuota - 1;
        int año = añoFactura + (mes / 12);
        mes %= 12;
        if (mes == 0) {
            mes = 12;
        }
        return mes + "/" + año;
    }
}


