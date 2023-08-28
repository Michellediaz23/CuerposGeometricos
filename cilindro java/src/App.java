import java.util.Scanner;

public class cilindro {
    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
        double areaLateral, areaTotal, volumen;
        
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();
    
        areaLateral = 2 * Math.pi * radio * altura;
        areaTotal = 2 * Math.pi * radio * (altura + radio);
        volumen = pi * Math.sin(radio, 2) * altura;
    
        System.out.println("El área lateral del cilindro es: " + areaLateral);
        System.out.println("El área total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);

       System.exit(0);
    }
}


