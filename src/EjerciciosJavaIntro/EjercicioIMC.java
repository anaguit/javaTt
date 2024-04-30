package EjerciciosJavaIntro;
import EjerciciosJavaIntro.FuncionesJavaIntro;
import java.util.Scanner;

public class EjercicioIMC {
    public static void ingresarInfoCorporal(){
        Scanner leer = new Scanner(System.in);
        //ingresa peso
        System.out.println("ingresa tu peso:");
        double kg = leer.nextDouble();
        System.out.println("Tu peso es " + kg);
        //ingresa altura
        System.out.println("ingresa tu altura");
        double metros = leer.nextDouble();
        System.out.println("tu altura es " + metros);

        double imc = FuncionesJavaIntro.calcularIMC(kg,metros);
        if(imc<18.5){
            System.out.println("Estás en bajo peso, tu IMC es: " + imc);
            } else if (imc>=18.5 && imc<24.9) {
                System.out.println("Estás en peso normal, tu IMC es: " + imc);
            } else if (imc>=24.9 && imc<29.9) {
                System.out.println("Estás en sobrepeso, tu IMC es: " + imc);
            } else {
                System.out.println("Estás obeso, tu IMC es: " + imc);
        };
    };
};
