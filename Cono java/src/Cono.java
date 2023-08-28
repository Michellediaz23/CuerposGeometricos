
import java.util.Scanner;

public class Cono {
    public static void main(String[] args) 
     Scanner lector = new Scanner(System.in);
        double areaLateral, areaTotal, areaDeBase, volumen;
        
    
        System.out.print("Inserte la generatriz del cono: ");
        Scanner scanner = new Scanner(System.in);
        double generatriz = scanner.nextDouble();
        
        System.out.print("Inserte la altura del cono: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Inserte el radio del cono: ");
        double radio = scanner.nextDouble();
    
        areaLateral = Math.pi * radio * generatriz;
        areaTotal = Math.pi * radio * (generatriz + radio);
        areaDeBase = Math.pi * Math.pow(radio, 2);
        volumen = areaDeBase * altura / 3;
        
        System.out.println("El área lateral del cono es: " + areaLateral);
        System.out.println("El área total del cono es: " + areaTotal);
        System.out.println("El área de la base del cono es: " + areaDeBase);
        System.out.println("El volumen del cono es: " + volumen);
    
        System.exit(0);
    }
}
