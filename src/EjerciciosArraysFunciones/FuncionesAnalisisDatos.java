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
};
