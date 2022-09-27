package codigosPrueba;

import org.w3c.dom.css.CSSValue;
import org.w3c.dom.css.CSSValueList;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class Almacenamiento {
    public static void main (String[]args){
    int regreso=1;
    int seleccion;
    String nombrep;
    double pr;
    int ve;
    int co;
    int ex;
    int ncontrol;
        Scanner sc=new Scanner(System.in);
        Scanner c=new Scanner(System.in);
        try{
            Stream<String> filas = Files.lines((Paths.get("./src/codigosPrueba/mercancia/")));


            List<Mercancia> mercancia=new ArrayList<>();

                    mercancia=filas.map(fila->fila.split(","))
                    .map(fila-> {
                        return new Mercancia
                       (fila[0], Double.parseDouble(fila[1]) , Integer.parseInt(fila[2]), Integer.parseInt(fila[3]), Integer.parseInt(fila[4]));}
                    )
                    .collect(Collectors.toList());

            filas.close();

            while (regreso==1) {
                System.out.println(">>>>     Menú     <<<<");
                System.out.println("<<<<<Agregar producto -> preciona 1 >>>>>");
                System.out.println("<<<<<Eliminar producto -> presiona 2 >>>>>");
                System.out.println("<<<<<Mostrar productos-> presiona 3 >>>>>");
                System.out.println("<<<<<Modificar productos -> presiona 4 >>>>>");
                seleccion= sc.nextInt();

                switch (seleccion) {
                    case 1:
                        System.out.println("Introdusca el nombre del producto");
                        nombrep=c.nextLine();
                        System.out.println("Introdusca el precio del producto");
                        pr=c.nextDouble();
                        System.out.println("Introdusca el numero de ventas del producto");
                        ve=c.nextInt();
                        System.out.println("Introdusca el numero de compras del producto");
                        co=c.nextInt();
                        System.out.println("introdusca la cantidad de existencias del producto");
                        ex=c.nextInt();
                        mercancia.add(new Mercancia(nombrep,pr,ve,co,ex));
                        System.out.println(mercancia);

                        try{ //este p*nche pedaso de try guarda todo lo que queramos modificar hay que dejarlo al final de cada modificacion  de ariba
                            Files.writeString(Paths.get("./src/codigosPrueba/mercancia/"), mercancia.stream()
                                    .map(mercancia2->mercancia2.toString())
                                    .reduce("",(a,b)->a.toString()+b.toString()+"\n"));

                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("presiona 1 para seguir o 2 para salir");
                        regreso= sc.nextInt();
                        break;


                    case 2: // eliminacion de algun producto
                        System.out.println(mercancia);
                        System.out.println("introdusca el numero de producto que desea borrar");
                        ncontrol=c.nextInt();
                        mercancia.remove(ncontrol);
                        System.out.println(mercancia);


                        try{ //este p*nche pedaso de try guarda todo lo que queramos modificar hay que dejarlo al final de cada modificacion  de ariba
                            Files.writeString(Paths.get("./src/codigosPrueba/mercancia/"), mercancia.stream()
                                    .map(mercancia2->mercancia2.toString())
                                    .reduce("",(a,b)->a.toString()+b.toString()+"\n"));

                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("presiona 1 para seguir o 2 para salir");
                        regreso= sc.nextInt();
                        break;

                    case 3:// para nomas mostrar lo que contiene
                        mercancia.forEach(System.out::println);

                        System.out.println("presiona 1 para seguir o 2 para salir");
                        regreso= sc.nextInt();
                        break;

                    case 4: //para modificar productos= en desarollo
                        System.out.println("introduza numero para modificar");
                        ncontrol = c.nextInt();

                        System.out.println("introduza para modificar nombre");
                        nombrep = c.next();

                        //no jala el primero es int de para escoger la fila y el otro  es para cambiar el nombre nomas del producto dice elemento mercancia y no jala
                        //mercancia.set(ncontrol,nombrep);


                        System.out.println("------------");
                        System.out.println(mercancia);

                        try{ //este p*nche pedaso de try guarda todo lo que queramos modificar hay que dejarlo al final de cada modificacion  de ariba
                            Files.writeString(Paths.get("./src/codigosPrueba/mercancia/"), mercancia.stream()
                                    .map(mercancia2->mercancia2.toString())
                                    .reduce("",(a,b)->a.toString()+b.toString()+"\n"));

                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("presiona 1 para seguir o 2 para salir");
                        regreso= sc.nextInt();
                        break;
                }
            }


        } catch(Exception e){
            e.printStackTrace();
        }

    }
    }

