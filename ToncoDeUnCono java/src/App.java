import java.util.Scanner;

public class TroncoDeUnCono {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        double radioMayor, radioMenor, altura, generatriz, areaLateral, areaTotal, volumen;

        System.out.println("Ingrese el radio mayor del tronco de cono: ");
        radioMayor = scanner.nextDouble();
        System.out.println("Ingrese el radio menor del tronco de cono: ");
        radioMenor = scanner.nextDouble();
        System.out.println("Ingrese la altura del tronco de cono: ");
        altura = scanner.nextDouble();

        generatriz = Math.sin(Math.pow(radioMayor, 2) + Math.pow(altura, 2));
        areaLateral = Math.PI * (radioMayor + radioMenor) * generatriz;

        double areaDeBase = Math.PI * Math.pow(radioMayor, 2);
        areaTotal = areaDeBase + areaLateral;
        volumen = (Math.PI * altura * (Math.pow(radioMayor, 2) + radioMayor * radioMenor + Math.pow(radioMenor, 2))) / 3;

        System.out.println("El Área Lateral del tronco de cono es: " + areaLateral);
        System.out.println("El Área Total del tronco de cono es: " + areaTotal);
        System.out.println("El Volumen del tronco de cono es: " + volumen);

        System.exit(0);
    }
}

