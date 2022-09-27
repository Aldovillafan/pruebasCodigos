package codigosPrueba;

import java.util.ArrayList;
import java.util.Scanner;

public class CodigoArrayList {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int fila;
        String nombre;
        ArrayList<String> carros = new ArrayList<>();

        carros.add("toyota");
        carros.add("susuki");
        carros.add("ferrari");
        System.out.println(carros);

        System.out.println(carros.get(2));

        System.out.println("introduza el lugar que queramos modificar ponga numero");
        fila = s.nextInt();

        System.out.println("introduza para cambiar nombre ponga otro nombre");
        nombre = s.next();
        carros.set(fila, nombre);
        System.out.println(carros);

    }
}
