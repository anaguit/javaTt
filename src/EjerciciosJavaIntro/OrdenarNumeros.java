package EjerciciosJavaIntro;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void ingresarNumeros(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un número");
        int numero1 = leer.nextInt();
        System.out.println("ingrese un número");
        int numero2 = leer.nextInt();
        System.out.println("ingrese un número");
        int numero3 = leer.nextInt();
        leer.close();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("el numero más grande es " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("el numero más grande es " + numero2);
        } else {
            System.out.println("el numero mas grande es " + numero3);
        };
    };
};
