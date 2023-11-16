
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class Iglesias {
    //variables    
    public String nombreIglesia;//nombre de la iglesia
    public String nombrePastor;//nombre del pastor

    //Constructores

    public Iglesias(String nombreIglesia, String nombrePastor) {
        this.nombreIglesia = nombreIglesia;
        this.nombrePastor = nombrePastor;
    }

    public String getNombreIglesia() {
        return nombreIglesia;
    }

    public void setNombreIglesia(String nombreIglesia) {
        this.nombreIglesia = nombreIglesia;
    }

    public String getNombrePastor() {
        return nombrePastor;
    }

    public void setNombrePastor(String nombrePastor) {
        this.nombrePastor = nombrePastor;
    }
//metodo para mostrar
            public void muestraInfo(){
                System.out.println("\nNombre del pastor: " + nombrePastor +
                "\nNombre de la iglesia:  " + nombreIglesia);
                
                JOptionPane.showMessageDialog(null, "\nIglesia: " + nombreIglesia +
                "\nPastor: " + nombrePastor );
    }//fin del metodo muestraInfo
}
