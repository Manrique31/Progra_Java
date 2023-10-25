/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.clase.t;

import javax.swing.JOptionPane;

/**
 *
 * @author mtorr
 */
public class ClaseT {

    /**
     * @param args the command line arguments
     */
    /* Crear un metodo (calculadora) que tengo 3 parametros un string (suma,resta,division,multiplicacion)parametro2 double parametro3 double*/
    public static void main(String[] args) {
        Calculadora();
    }

    public static void Calculadora() {
        Double a = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero"));
        Double b = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero"));

        int calcular = Integer.parseInt(JOptionPane.showInputDialog("Escriba que tipo calculo es suma(1),resta(2),division(3),multiplicacion(4)"
        ));

        double suma = a + b;
        double resta = a - b;
        double division = a / b;
        double multiplicacion = a * b;

        switch (calcular) {
            case 1:
                System.out.println("La suma de:" + a + "+" + b + "es:" + suma);
                break;
            case 2:
                System.out.println("La resta de:" + a + "-" + b + "es:" + resta);
                break;
            case 3:
                System.out.println("La division de:" + a + "/" + b + "es:" + division);
                break;
            case 4:
                System.out.println("La multiplicacion de:" + a + "*" + b + "es:" + multiplicacion);
                break;
            default:
                throw new AssertionError();

        }

    }

}
