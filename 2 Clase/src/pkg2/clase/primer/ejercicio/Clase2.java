/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.clase.primer.ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author mtorr
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 1

/*Escriba un nuevo programa en JAVA que le solicite al usuario su
edad y le indique si puede o no puede votar.
Considere que en nuestro país, solo las personas con 18 años o
más pueden votar.*/

       /* String votar;
        int edad;
        votar = JOptionPane.showInputDialog("Digite su edad");
        edad = Integer.parseInt(votar);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Puede votar");
        } else {
            JOptionPane.showMessageDialog(null, "No puede votar");
        }*/

// Ejercicio 2
/*Escriba un nuevo programa en JAVA que le solicite al usuario la
nota final del curso anterior y le indique si aprobó o no.
Considere que para aprobar debe obtener una nota igual o
superior a 70.*/
       
        String curso;
        int nota;
        curso = JOptionPane.showInputDialog("Digite la nota final del curso anterior:");
        nota = Integer.parseInt(curso);

        if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Aprobo");
        } else {
            JOptionPane.showMessageDialog(null, "Reprobo");
        }
        
   
    }
    
}
