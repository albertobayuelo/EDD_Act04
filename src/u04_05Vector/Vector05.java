package u04_05Vector;

/**
 * @author AB
 * @author DC
 */

import java.util.Vector; 


public class Vector05 { 
        public static void main(String args[]) { 
                // Crear un nuevo Vector 
                Vector miVector = new Vector(); 


            // Agregar algunos elementos al vector 
            miVector.addElement("Daimer"); 
            miVector.addElement("Jose"); 
            miVector.addElement("Carmona"); 

            // Mostrar el contenido del vector 
            System.out.println("Contenido del vector:"); 
            for (int i=0; i < miVector.size(); i++) { 
                    System.out.println(miVector.elementAt(i)); 
            } 

            // Eliminar elementos 
            miVector.removeElementAt(1); 

            // Mostrar nuevamente el contenido del vector 
            System.out.println("Nuevo contenido del vector:"); 
            for (int i=0; i < miVector.size(); i++) { 
                    System.out.println(miVector.elementAt(i)); 
            } 
    } 

}
