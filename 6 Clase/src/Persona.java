/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class Persona {

    public int altura;//pies
    private int peso;
    private String nombre;
    private int id;
    private int edad;
    private String genero;
    private String clave;

    /*public void getAltura() {
        System.out.println("177");
    }

    private void getPeso() {
        System.out.println("77");
    }

    public int pesoPorAltura() {
        return altura * peso;
    }*/

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClave() {
        return "*******";
    }

    public void setClave(String clave) {
        if (clave.contains("1"))
        this.clave = clave;
        else
            System.out.println("Esta clave es invalida");
    }

    public Persona() {
        edad=1;
    }

    public Persona(int altura, int peso, String nombre, int id, int edad, String genero, String clave) {
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.clave = clave;
    }

    public Persona(int altura, int peso, String nombre) {
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
    }
    

}
