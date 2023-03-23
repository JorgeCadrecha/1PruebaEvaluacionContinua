package ElJuegoDeLaVida.dominio;

public class Tablero {
    private static  int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual(){


    }

    public void generarEstadoActualPorMontecarlo(){
        Random random = new Random();
        
        for(int fila = 0; fila <DIMENSION; fila++){
            for(int columna = 0; columna < DIMENSION; columna++){
                int random2 = random.nextInt(2);
                if (random2 == 1){
                    estadoActual[fila][columna] = 1;
                } else {
                    estadoActual[fila][columna] = 0;
                }
            }
        }
    }

    public void transitarAlEstadoSiguiente(){

    }

    @Override
    public String toString(){

        return "";
    }
}
