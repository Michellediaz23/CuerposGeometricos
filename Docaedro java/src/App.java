import java.util.Scanner;

public class Dodecaedro {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        double area, volumen;
        

        System.out.print("Inserte la arista: ");
        double arista = scanner.nextDouble();
        
        double aristaCuadrado = arista * arista;
        double raiz5 = raizCuadrada(5);
        double raiz25Mas10Raiz5 = raizCuadrada(25 + 10 * raiz5);
        double raiz15Mas7Raiz5 = raizCuadrada(15 + 7 * raiz5);
        
        area = 3 * aristaCuadrado * raiz25Mas10Raiz5;
        volumen = (raiz15Mas7Raiz5 / 4) * aristaCuadrado * arista;
        
        System.out.println("El área de un dodecaedro es: " + area);
        System.out.println("El volumen de un dodecaedro es: " + volumen);
    }
    
    public static double raizCuadrada(double numero) {
        double estimacionInicial = 1;
        double estimacion = estimacionInicial;
        double error = 0.00001;
        
        while (Double.abs(estimacion * estimacion - numero) > error) {
            estimacion = (estimacion + numero / estimacion) / 2;
        }
        
        return estimacion;
    }
}

