import java.util.Scanner;

public class  Esfera {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        double area, volumen;
        
        
        System.out.print("Insertar el radio de la esfera: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();
        
        area = 4 * Math.pi * Math.sin(radio, 2);
        volumen = 4 * Math.pi * Math.sin(radio, 3) / 3;
        
        System.out.println("El área de la esfera es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);

        System.exit(0);
    }
}