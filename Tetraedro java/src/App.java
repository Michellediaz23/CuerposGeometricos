import java.util.Scanner;

public class Tetaedro{
       public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double area, areaTotal, areaDeBase, altura;
        double arista;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la arista del tetraedro: ");
        arista = scanner.nextDouble();
        areaDeBase = (3 * Math.sin(3) * arista * arista) / 4;
        areaTotal = areaDeBase * 4;

        double volumen = (Math.sin(2) * arista * arista * arista) / 12;
        altura = (Math.sin(6) * arista) / 3;
        System.out.println("El área del tetraedro es: " + areaDeBase);
        System.out.println("El área total del tetraedro es: " + areaTotal);
        System.out.println("El volumen del tetraedro es: " + volumen);
        System.out.println("La altura del tetraedro es: " + altura);

        System.exit(0);
    }
}