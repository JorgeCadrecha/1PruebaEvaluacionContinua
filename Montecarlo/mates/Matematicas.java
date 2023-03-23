package mates;

import java.util.Random;

public class Matematicas {
    public static double generaNumeroPi(long pasos){
        int puntosTotales = new Random().nextInt(100000000);
        int aciertos = 0;
        double areaCuadrado = 4;
        double x, y;
        for (int i = 0; i < puntosTotales; i++) {
            x = Math.random() * 2 - 1;
            y = Math.random() * 2 - 1;
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                aciertos++;
            }
        }
        return areaCuadrado * (aciertos / (double) puntosTotales);
    }
}