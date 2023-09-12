import javax.swing.JOptionPane;
public class Tercero {

    public static void main(String[] args) {
    	int sueldoActual=500000;
    	double descuento=0;
    	int resultado=0;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");       
        int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato social del empleado: "));      
        double valorDescuento = 0.0;
        
        switch (estrato) {
            case 1:
                valorDescuento = 0.02;
                break;
            case 2:
                valorDescuento = 0.02;
                break;
            case 3:
                valorDescuento = 0.04;
                break;
            case 4:
                valorDescuento = 0.04;
                break;
            case 5:
                valorDescuento = 0.08;
                break;
            case 6:
                valorDescuento = 0.10;
                break;
            default:
            	System.out.println("Estrato no valido");
                
                break;
        }
        descuento= (sueldoActual * valorDescuento);
        resultado = (int) (sueldoActual-descuento);
        System.out.println("Nombre : "+nombre+" Estrato "+estrato+" Sueldo actual con descuento :"+resultado);      
    }
}