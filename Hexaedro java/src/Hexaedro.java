import java.util.Scanner;

public class Hexaedro {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        double area, volumen;
        
        System.out.print("Inserte la arista: ");
        double arista = scanner.nextDouble();
        
        area = 2 * Math.pow(arista, 2) * Math.sqrt(3);
        volumen = Math.sqrt(2) * Math.pow(arista, 3) / 3;
        
        System.out.println("El área del hexaedro es: " + area);
        System.out.println("El volumen del hexaedro es: " + volumen);

         System.exit(0);
    }
}