import javax.swing.JOptionPane;
public class Primero {

    public static void main(String[] args) {
       
        int n = 0;
        int cantidad = 0;
        int mayorEdad = 0;
        int menoresEdad = 0;
      
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de personas a registrar:"));
       
        for (int i = 0; i < n; i++) {
            
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
            String documento = JOptionPane.showInputDialog("Ingrese el documento de la persona:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona:"));
            String profesion = JOptionPane.showInputDialog("Ingrese la profesión de la persona:");
           
            cantidad++;
            
            if (edad >= 18) {
                mayorEdad++;
            } else {
                menoresEdad++;
            }
        }

        System.out.println("Personas registradas: " + n);
        System.out.println("Personas ingresadas: " + cantidad);
        System.out.println("Personas mayores de edad: " + mayorEdad);
        System.out.println("Personas menores de edad: " + menoresEdad);    
    }
}
