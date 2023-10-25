
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class Colegiado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/* Realice el ejercicio propuesto.
Spotify requiere crear una clase para controlar la programación de sus canciones,
para ello requiere los siguientes atributos: Id. de la canción, título, autor, duración
y año de creación.

Cree en la clase los atributos correspondientes, el constructor y los métodos
encapsuladores.
Realice los llamados de los getters y setters en el programa principal.

“Sé fuerte, vive con fe y con paciencia. No estás tarde ni temprano, estás en tu tiempo”. */
        int ID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la cancion:"));
        String autor = JOptionPane.showInputDialog("Ingrese el autor:");
        String titulo = JOptionPane.showInputDialog("Ingrese el nombre de la cancion:");
        double duracion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la duracion que posee la cancion:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio en que se creo la cancion:"));

        Cancion cancion = new Cancion(ID, autor, titulo, duracion, anio);

        JOptionPane.showMessageDialog(null, "La informacion de la cancion es:\n" +"ID:" + cancion.getIDcancion() +"\nAutor:" + cancion.getAutor() +"\nTitulo:"+cancion.getTitulo()+"\nDuracion:"+cancion.getDuracion()+"\nAnio de creacion:"+cancion.getAniocancion());

    }
    
}
