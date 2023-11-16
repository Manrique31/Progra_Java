
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class feligreses {
    
    private Iglesias [] feligreses;// Arreglo para almacenar 
    public int cantidad;
    public int cedula;
    public String nombreFeligreses; 

    public feligreses(Iglesias[] feligreses, int cantidad, int cedula, String nombreFeligreses) {
        this.feligreses = feligreses;
        this.cantidad = cantidad;
        this.cedula = cedula;
        this.nombreFeligreses = nombreFeligreses;
    }

    public Iglesias[] getFeligreses() {
        return feligreses;
    }

    public void setFeligreses(Iglesias[] feligreses) {
        this.feligreses = feligreses;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreFeligreses() {
        return nombreFeligreses;
    }

    public void setNombreFeligreses(String nombreFeligreses) {
        this.nombreFeligreses = nombreFeligreses;
    }

  
   
        // Metodo para agregar un producto al inventario
    public void agregarFeligreses(feligreses feligreses){
        if (cedula < feligreses.cedula) { ;
        } else{
            JOptionPane.showMessageDialog(null, "Error: No se puede agregar mas feligreses.");
        }//fin del else
        
    }//fin del metodo
    
  
    
}
