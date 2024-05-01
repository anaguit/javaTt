package EjerciciosArraysFunciones;

import java.util.Scanner;
import EjerciciosArraysFunciones.FuncionesAnalisisDatos;
public class EjercicioAnalisisDatos {
    public static void numeroMaximo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese un numero");
        int num2 = leer.nextInt();
        System.out.println("ingrese un numero");
        int num3 = leer.nextInt();
        System.out.println("ingrese un numero");
        int num4 = leer.nextInt();
        int[]numeros = {num1,num2,num3,num4};
        leer.close();
        System.out.println("el numero mayor es: ");
        System.out.println(FuncionesAnalisisDatos.encontrarMaximo(numeros));
    };
}
