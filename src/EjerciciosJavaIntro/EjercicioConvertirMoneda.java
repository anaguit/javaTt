package EjerciciosJavaIntro;
import EjerciciosJavaIntro.FuncionesJavaIntro;

import java.util.Scanner;

public class EjercicioConvertirMoneda {
    public static void ingresarMontoPesos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresá el monto en pesos a convertir");
        double pesos = leer.nextDouble();
        double dolar = 2000;
        double monedaConvertida = FuncionesJavaIntro.convertirMoneda(pesos,dolar);
        System.out.println("vas a comprar " + monedaConvertida + " dolares");
    }
}
