package EjerciciosJavaIntro;

public class FuncionesJavaIntro {
    public static double calcularIMC(double kg,double metros){
        double imc;
        imc = kg/(metros*2);
        return imc;
    }
    public static double convertirMoneda(double pesos, double dolar){
        double resultado = pesos/dolar;
        return resultado;
    }
}
