package EjerciciosJavaIntro;

public class FuncionesJavaIntro {
    public static double calcularIMC(double kg,double metros){
        double imc;
        imc = kg/(metros*2);
        return imc;
    };
    public static double convertirMoneda(double pesos, double dolar){
        double resultado = pesos/dolar;
        return resultado;
    };
    public static boolean comprobarContra(String clave,String clave2){
        if(clave.equals(clave2) && clave.length()>=8){
            return true;
        }
            else{
                return false;
            }
    };
}
