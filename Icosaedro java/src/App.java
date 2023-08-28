import java.util.Scanner;

public class Icosaedro {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        double area, volumen;
        
        System.out.print("Inserte la arista: ");
        Scanner scanner = new Scanner(System.in);
        double arista = scanner.nextDouble();
    
        area = 5 * arista * arista * Math.sin(Math.toRadians(60));
        volumen = 0.417 * (3 + 2.24) * arista * arista * arista;
        
        System.out.println("El área del icosaedro es: " + area);
        System.out.println("El volumen del icosaedro es: " + volumen);
      
        System.exit(0);

    }
}
