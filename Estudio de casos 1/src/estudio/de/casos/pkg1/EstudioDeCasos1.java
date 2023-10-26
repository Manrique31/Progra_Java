/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.casos.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author mtorr
 */
public class EstudioDeCasos1 {

    /**
     * @param args the command line arguments
     */
/*Una empresa nacional ocupa llevar control de las personas que tienen deudas con la institución
por lo que se requiere un sistema que logre almacenar la siguiente información:
• Nombre de cliente
• Cedula de cliente
• Numero de factura
• Monto de la factura
• Mes de la factura
• Año de la factura
• Estado de la factura (No pagada)
El sistema permitirá agregar varias facturas al mismo cliente*/
    public static void main(String[] args) {
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente:"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");

        Cliente cliente = new Cliente(cedula, nombre);

        int respuesta;
        boolean continuar = true;

        while (continuar) {
            int numeroFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de factura:"));
            int mesFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura:"));
            int añoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio de la factura:"));
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int estadoFactura = Integer.parseInt(JOptionPane.showInputDialog("Cual es el estado de la factura? (1: Pagada, 2: No pagada):"));

            cliente.agregarFactura(numeroFactura, mesFactura, añoFactura, montoFactura, estadoFactura);

            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Desea agregar otra factura?\n1. Si\n2. No"));
            continuar = (respuesta == 1);

            System.out.println("Factura agregada.");
        }

        double deudaTotal = cliente.calcularDeudaTotal();
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Numero de meses para el plan de pago:"));
        cliente.generarPlanPago(meses);

        System.out.println("Deuda Total: " + deudaTotal);
        System.out.println("Plan de Pago Generado.");
    }
    
}
