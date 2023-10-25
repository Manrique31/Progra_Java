/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona juan = new Persona();//instanciar
        Persona pedro = new Persona();//(("0, 0, nombre, 0, 0, genero, clave));
        juan.getAltura();//cm
        System.out.println(juan.getClave());
        /*String hilera1 ="";
        String hilera2 ="";
        System.out.println(hilera1.compareTo(hilera2));
        //System.out.println(juan.pesoPorAltura());*/
        juan.setClave("Esta es mi clave1");
        System.out.println(juan.getEdad());
        System.out.println(pedro.getEdad());
        
      /* EjemploVariableStatic EjemploVariableStatic= new EjemploVariableStatic();
        EjemploVariableStatic.dolar=600;
        System.out.println(EjemploVariableStatic.valor);*/
    }
    
}
