package miPaquete1;

public class SumaNumeros {
    public static int getSumaUno(int valor){
        int acumulador = 0;

        for (int i = 1; i <= valor; i++ ){
            acumulador += i;
        }
        return acumulador;
    }

    public static int obtenerSumaDos(int valor){
        if (valor <= 0){
            return 0;
        }else {
            return valor + obtenerSumaDos(valor - 1);
        }
    }
}
