
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mtorr
 */
public class Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la capacidad de la iglesia: "));
        // Crea una instancia de la clase 
        feligreses clase10 = new feligreses(cantidad);

        while (true) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Eliga un opcion: "
                    + "\n1. Ingresar feligres nuevo"
                    + "\n2. Mostrar las Iglesias existentes"
                    + "\n3. Buscar feligres por ID"
                    + "\n4. Ingresar sacar feligres"
                    + "\n5. Salir"));

            switch (opcion) {
                case 1:
                    int i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID:"));
                    String feligreses = JOptionPane.showInputDialog("Ingrese el nombre del feligres:");
                    int j = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de feligreses:"));
                    // Agrega un nuevo 
                    clase10.agregarFeligreses(clase10);
                    break;

                case 2:
                    
                    clase10.getCantidad();
                    break;
                    
                case 3:
                    int codigoBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del feligres a buscar:"));
                    
                    feligreses feligreses = clase10.getFeligreses();
                    if (feligreses != null) {
                        feligreses.getFeligreses();
                    } else {
                        JOptionPane.showMessageDialog(null, "No encontrado.");
                    }
                    break;
                    
                case 4:
                    int resta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del feligres a quitar:"));
                    clase10.setCantidad(cantidad);
                    break;
                    
                case 5:
                    // Mensaje de salida y termina la ejecución del programa
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                    
                default:
                    // Mensaje de error si se ingresa una opción no válida
                    JOptionPane.showMessageDialog(null, "Opción no valida. Por favor, ingrese una opcion valida.");
                    break;
    }
            
    
}
