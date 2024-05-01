package EjerciciosArraysFunciones;

public class FuncionesAnalisisDatos {
    public static int encontrarMaximo(int[]numeros){
        int numeroMaximo = 0;
        for(int i = 0; i<numeros.length;i++){
            if(numeros[i]>numeroMaximo){
                numeroMaximo = numeros[i];
            } else {
                numeroMaximo = numeroMaximo;
            };
        };
        return numeroMaximo;
    };
    public static int encontrarMinimo(int[]numeros){
        int numeroMinimo=numeros[0];
        for(int i=1; i<numeros.length;i++){
            if(numeros[i]<numeroMinimo){
                numeroMinimo = numeros[i];
            } else{
               numeroMinimo = numeroMinimo;
            };
        };
        return numeroMinimo;
    };
    public static double calcularPromedio(double[]numeros){
        double sumaNumeros=0;

        for(int i=0; i<numeros.length; i++){
            sumaNumeros = sumaNumeros + numeros[i];
        }
        double promedio = sumaNumeros / numeros.length;

        return promedio;
    };
};
