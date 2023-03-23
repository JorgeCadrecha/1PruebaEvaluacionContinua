
package aplicacion;

import mates.Matematicas;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int random = new Random().nextInt(100000000);
        System.out.println("El número PI es " + Matematicas.generaNumeroPi(random));


    }
}