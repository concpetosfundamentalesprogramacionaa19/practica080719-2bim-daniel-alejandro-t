package miPaquete1;

public class Potencia {
    public static int get_potencia(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else{
            return base * get_potencia(base, exponente - 1);
        }
    }

    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 );
        }

    }

    public static int getSumaValores(int [] misNumeros){
        int acumulador = 0;

        for (int i = 0; i < misNumeros.length; i++){
            acumulador += misNumeros[i];
        }
        return acumulador;
    }

}
