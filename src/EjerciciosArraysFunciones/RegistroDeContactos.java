package EjerciciosArraysFunciones;

import java.util.Scanner;
import EjerciciosArraysFunciones.FuncionesRegistroContactos;
public class RegistroDeContactos {
    public static void nuevoContacto(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese nombre de contacto nuevo");
        String contactoNuevo = leer.nextLine();
        leer.close();
        System.out.println("el nuevo contacto es");
        System.out.println(FuncionesRegistroContactos.agregarContacto(contactoNuevo));
    };
}
