
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class Ejercicio_practico_1 {

    /**
     * @param args the command line arguments
     */
    
    /*Una empresa necesita determinar el monto total que debe pagar a la Caja Costarricense del
Seguro Social (CCSS). Para esto, se requiere un programa que calcule dicho monto basado en el
salario de N empleados. El programa debe solicitar la cantidad de empleados, así como los
salarios individuales, y calcular el monto total a pagar aplicando los siguientes rubros:*/
    public static void main(String[] args) {
        String empleados;
        empleados = JOptionPane.showInputDialog("Digite el numero de empleados");
        System.out.println("La cantidad de empleados fueron:" + " " + empleados);

        String LEC;
        double salario;
        LEC = JOptionPane.showInputDialog("Digite el salario individual:");
        salario = Double.parseDouble(LEC);
        System.out.println("El salario de cada empleado es:" + salario);
        JOptionPane.showMessageDialog(null, "En consecuencia, la empresa deberá pagar a la CCSS un total de:" + salario);

    }

}
