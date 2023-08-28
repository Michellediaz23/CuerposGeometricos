import java.util.Scanner;

public class piramide{
     public static void main(String[] args) {
        double lados,  apotema, altura, volumen;

        System.out.println("ingresa lado de la piramide :");
          double lado = Scanner.nextDouble();
      
        System.out.println("calcule el apotema de la piramide :");
          double apotema = Scanner.nextDouble();

        System.out.println(" ingrese altura de la piramide: ");
            double altura = scanner.nextDouble();
        
        double areaLateral = (lado * apotema) / 2;
        double areaBase = (lado * lado);
        double areaTotal = areaLateral + areaBase;
        double volumen = (areaBase * altura) / 3;
        
        System.out.println("Área Lateral: " + areaLateral);
        System.out.println("Área de la Base: " + areaBase);
        System.out.println("Área Total: " + areaTotal);
        System.out.println("Volumen: " + volumen);

        System.exit(0);
        
    }
}
  {      

}
  


