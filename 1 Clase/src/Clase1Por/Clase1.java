package Clase1Por;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Ejercicio 1
/*Elabore un programa que calcule cuántos años tendrá el usuario en 5 años
, al finalizar se imprime el siguiente mensaje “Dentro de 5 años, tendrá: 
“ y se muestre el valor de la edad proyectada.Debe solicitar como dato de 
entrada la edad actual.*/

       /* String lec;
        int edad;

        lec = JOptionPane.showInputDialog("Digite su edad");
        edad = Integer.parseInt(lec);

        JOptionPane.showMessageDialog(null, "Dentro de 5 años, tendrá: " + (edad + 5));
        System.out.println(edad + 5);*/
        
  //Ejercicio 2      
/*Desarrolle un programa que calcule el porcentaje de gastos por
concepto de alimentación y el porcentaje que queda disponible
para otros gastos. Debe proporcionar como datos de entrada el
monto de ingreso mensual y el gasto mensual por alimentación.*/
        String gastos;
        double salario;
        gastos = JOptionPane.showInputDialog("Digite su salario mensual:");
        salario = Double.parseDouble(gastos);
        System.out.println("Su salario actual es de:" + gastos);

        String menos;
        double comida;
        menos = JOptionPane.showInputDialog("Digite la cantidad de dinero gastada en alimentacion al mes:");
        comida = Double.parseDouble(menos);
        System.out.println("El gasto que realizo este mes fue de:" + menos);

        JOptionPane.showMessageDialog(null, "El monto de ingreso mensual es de:" + salario + " " + "\n" + "El gasto mensual por alimentación es de:" + comida);
        JOptionPane.showMessageDialog(null, "La cantidad que le queda disponible para otros gastos es de:" + (salario - comida));
        
                
    }
    
}
