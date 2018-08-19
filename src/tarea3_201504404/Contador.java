package tarea3_201504404;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

    }
    public static Scanner entrada = new Scanner(System.in);
    public static int menu;

    public static void contador() {

        boolean menupt = false;
        boolean buscar = false;
        boolean mostrar = false;

        do {
            try {
                System.out.println("-----Contador de Digitos Repetidos-----");
                System.out.println("1.- Ingresar Número");
                System.out.println("2.- Ingresar Número a Buscar");
                System.out.println("3.- Mostar Numero");
                System.out.println("4.- Menu Principal");
                menu = entrada.nextInt();

                Tarea3_201504404 usu = new Tarea3_201504404();
                Contador cont = new Contador();

                switch (menu) {
                    case 1:
                        buscar = true;
                        mostrar = true;
                        Contador.numero();
                        break;
                    case 2:
                        if (buscar) {

                            System.out.println("----Ingrese Numero a Buscar----");
                            Contador.buscar();

                        } else {
                            System.out.println("debes ingresar primero el Número");
                            System.out.println("");
                        }
                        break;

                    case 3:
                        if (mostrar) {

                            System.out.println("----Numero Mostrado----");
                            Contador.mostrar();

                        } else {
                            System.out.println("debes ingresar primero el Número");
                            System.out.println("");
                        }
                        break;
                    case 4:
                          menupt=true;
                         usu.main (null);
                    default:
                        System.out.println("TIENES QUE INGRESAR UN NUMERO ENTRE 1 y 4");
                        System.out.println("");
                }
            } catch (Exception ex) {
                System.out.println("SOLO SE DEBE INGRESAR UN VALOR NUMERICO");
                entrada.next();

            }
        } while (!menupt);

    }
    public static int number[] = new int[1];
    public static int numbr;
   public static int i;
    public static void numero() {
            for ( i = 0; i < number.length; i++) {
            System.out.println("Ingrese el Numero Entero: "+(i+1)); 
            numbr=entrada.nextInt();
            number[i] = numbr;
   
        }

    }

    public static void buscar() {
            
            System.out.println("Número entero ");
            numbr=entrada.nextInt();
            
            
            
       
    }

    public static void mostrar() {
        for (int i = 0; i < number.length; i++) {
        System.out.println("Número entero " + number[i]);

            

        }

    }
}
