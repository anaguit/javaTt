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
    public static void numeroMinimo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese un numero");
        int num2 = leer.nextInt();
        System.out.println("ingrese un numero");
        int num3 = leer.nextInt();
        System.out.println("ingrese un numero");
        int num4 = leer.nextInt();
        leer.close();
        int[]numeros = {num1,num2,num3,num4};
        System.out.println("el numero minimo es:");
        System.out.println(FuncionesAnalisisDatos.encontrarMinimo(numeros));
    };
    public static void promedioNumeros() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        double num1 = leer.nextInt();
        System.out.println("ingrese un numero");
        double num2 = leer.nextInt();
        System.out.println("ingrese un numero");
        double num3 = leer.nextInt();
        System.out.println("ingrese un numero");
        double num4 = leer.nextInt();
        leer.close();
        double[] numeros = {num1, num2, num3, num4};
        System.out.println("el numero promedio es:");
        System.out.println(FuncionesAnalisisDatos.calcularPromedio(numeros));
    };
}
