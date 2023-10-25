/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class Cancion {
    
    private int IDcancion;
    private String autor;
    private String titulo;
    private double duracion;
    private int aniocancion;

//constructor
    public Cancion(int IDcancion, String autor, String titulo, double duracion, int aniocancion) {
        this.IDcancion = IDcancion;
        this.autor = autor;
        this.titulo = titulo;
        this.duracion = duracion;
        this.aniocancion = aniocancion;
    }
//setters y getters
    public int getIDcancion() {
        return IDcancion;
    }

    public void setIDcancion(int IDcancion) {
        this.IDcancion = IDcancion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAniocancion() {
        return aniocancion;
    }

    public void setAniocancion(int aniocancion) {
        this.aniocancion = aniocancion;
    }
            
    
}
