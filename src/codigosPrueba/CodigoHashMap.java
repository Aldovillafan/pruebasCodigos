package codigosPrueba;

import java.util.HashMap;
import java.util.Scanner;

public class CodigoHashMap {
    public static void main(String[] args) {
        String pais;
        String ciudad;

        Scanner p=new Scanner(System.in);

            //clave , valor
        HashMap<String, String> mundo = new HashMap<>();

        System.out.println("introduzca una pais");
        pais = p.next();

        System.out.println("introduzca un ciudad");
        ciudad = p.next();
        mundo.put(pais,ciudad);


        //se juntan esa clave y valor que le demos
        mundo.put("usa", "washintong DC");
        mundo.put("inglatera","londres");
        System.out.println(mundo);

        //acceder a un elemento
        System.out.println("introduzca un pais para darle su ciudad");
        pais = p.next();
        System.out.println(mundo.get(pais));

        //remueve un elemento
        System.out.println("introduzca un pais para remover");
        pais = p.next();
        mundo.remove(pais);
        System.out.println(mundo);

        //solo aparecen los paises
        System.out.println("solo aparecen los paises");
        for (String i : mundo.keySet()) {
            System.out.println(i);

            //solo aparecen las ciudades
            System.out.println("solo aparecen los paises");
            for (String v : mundo.values()) {
                System.out.println(v);
            }

            //
            for (String e : mundo.keySet()) {
                System.out.println("clave: " + e + " valor: " + mundo.get(e));
            }
        }
    }
}
