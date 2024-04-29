package Calculadora;
import java.util.Scanner;
public class MenuCalculadora {
    public static void menuCalculadora(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una opción:");
        System.out.println("1.sumar \n 2.restar \n 3.dividir \n 4.multiplicar");

        int opcion = leer.nextInt();
        int numA;
        int numB;
        switch (opcion){
            case 1:
                System.out.println("ingrese un número");
                numA = leer.nextInt();
                System.out.println("ingrese otro número");
                numB = leer.nextInt();
                System.out.println(Calculadora.sumar(numA,numB));
                break;
            case 2:
                System.out.println("ingrese un número");
                numA = leer.nextInt();
                System.out.println("ingrese otro número");
                numB = leer.nextInt();
                System.out.println(Calculadora.restar(numA,numB));
                break;
            case 3:
                System.out.println("ingrese un número");
                numA = leer.nextInt();
                System.out.println("ingrese otro número");
                numB = leer.nextInt();
                System.out.println(Calculadora.dividir(numA,numB));
                break;
            default:
                System.out.println("ingrese un número");
                numA = leer.nextInt();
                System.out.println("ingrese otro número");
                numB = leer.nextInt();
                System.out.println(Calculadora.multiplicar(numA,numB));
        }
    }
}
