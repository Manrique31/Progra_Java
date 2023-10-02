
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author mtorr
 */
public class clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Ejercicio 1
//Cree un proyecto que imprima un rectángulo de 10 símbolos en 5 líneas, pero sólo puede imprimir una a la vez.

   /*     String rectangulo = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                rectangulo = rectangulo + "@";
            }
            rectangulo = rectangulo + "\n";
        }
        System.out.println(rectangulo);

    }

}
         */
        //Ejercicio 2
        //Desarrolle un nuevo proyecto que le solicite al usuario un número y muestre la tabla de multiplicar de dicho número.
  /*      String numero;
        int tabla;
        numero = JOptionPane.showInputDialog("Digite un numero:");
        tabla = Integer.parseInt(numero);
        for (int i = 0; i < 11; i++) {
            System.out.println(tabla + "x" + i + "=" + i * tabla);
        }//fin de for
       
         */
 /*Desarrolle un programa que solicite un valor y dibuje un triángulo
con el número de filas indicado. Por ejemplo: Si el número
indicado es 5, entonces:*/
// Ejercicio 3

  /*      int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        String resultado = "";
        for (int i = 1; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
                resultado = resultado + "+";
            }//fin del for j
            System.out.println("\n");
            resultado = resultado + "\n";
        }//fin frl for i
        JOptionPane.showMessageDialog(null, resultado);
*/
//Ejercicio 4
/*Desarrolle un programa que le muestre al usuario los valores
entre 20 y 30 (inclusive) y su correspondiente valor al
cuadrado.*/
  /*      int numero;
        System.out.println("valores entre 20 y 30 (inclusive) y sus cuadrados");
        for (int i = 20; i <= 30; i++) {
            numero = i * i;
            System.out.println(i + " el cuadrado es: " + numero);

        }//fin del for i 
          */
        //Ejercicio 5
/*Desarrolle un programa que solicite una cantidad de
estudiantes y posteriormente solicite la nota para cada uno de
ellos. Calcule la nota promedio, la nota mayor, la nota menor y la
cantidad de estudiantes aprobados. Se aprueba al menos con
70.*/

        String estudiantes;
        int cantidad;

        estudiantes = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:");
        cantidad = Integer.parseInt(estudiantes);

        String nota;
        int calculo;
        nota = JOptionPane.showInputDialog("Ingrese la nota de cada alumno correspondientemente:");
        calculo = Integer.parseInt(nota);
        
        /*for (int i = 0; i < 10; j++) {
            estudiantes = i
                    nota = j
        }//fin de for i*/
                
        if (calculo>=70){
            JOptionPane.showMessageDialog (null, "Aprobo");
        }
        else {
            JOptionPane.showMessageDialog (null, "Reprobo");
        }
        
    }//fin del main
}//fin de clase

