package ElJuegoDeLaVida.dominio;

public class Tablero {
    private static  int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual(){
        for (int fila = 0; fila < DIMENSION; fila++) {
            for (int columna = 0; columna < DIMENSION; columna++) {
                int estado = estadoActual[fila][columna];

                System.out.println(estado + " ");
            }
        }
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
        for (int fila = 0; fila < DIMENSION; fila++) {
            for (int columna = 0; columna < DIMENSION; columna++) {
                int  estado = estadoActual[fila][columna];
                if(estadoActual[fila][columna] == 1){
                    if( estado == 2 || estado == 3){
                        estadoSiguiente[fila][columna] = 1;
                    } else {
                        estadoSiguiente[fila][columna] = 0;
                    }
                    estadoSiguiente[fila][columna] = 1;
                } else {
                    estadoSiguiente[fila][columna] = 0;
                }
                estadoSiguiente[fila][columna] = estadoActual[fila][columna];
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int fila = 0; fila < DIMENSION; fila++) {
            for (int columna = 0; columna < DIMENSION; columna++) {
                sb.append(estadoActual[fila][columna] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
