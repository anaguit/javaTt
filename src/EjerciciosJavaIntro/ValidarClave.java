package EjerciciosJavaIntro;
import  EjerciciosJavaIntro.FuncionesJavaIntro;

import java.util.Scanner;

public class ValidarClave {
    public static void ingresoClave(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una contraseña mayor a 8 dígitos");
        String clave = leer.nextLine();
        System.out.println("ingresala nuevamente");
        String claveRepetida = leer.nextLine();
        leer.close();
        boolean validacion = FuncionesJavaIntro.comprobarContra(clave,claveRepetida);
        if(validacion == true){
            System.out.println("contraseña creada con éxito");
        }
            else{
                System.out.println("Error en generación de contraseña");
            };
    };
};
