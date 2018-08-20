package tarea3_201504404;

import java.util.Scanner;

public class Promedio {

    public static Scanner st = new Scanner(System.in);
    public static int menu;

    public static void promedio() {

        boolean mutr = false;
        boolean gen = false;
        boolean prim = false;

        do {
            try {
                System.out.println("-----Promedio de estudiantes-----");
                System.out.println("1.- Ingresar id");
                System.out.println("2.- ingresar notas");
                System.out.println("3.- Genear Tabla de Promedios");
                System.out.println("4.- Menu principal");
                menu = st.nextInt();

                Tarea3_201504404 usu = new Tarea3_201504404();
                Promedio prom = new Promedio();

                switch (menu) {
                    case 1:
                        gen = true;
                        prim = true;
                        prom.tabla();

                        break;
                    case 2:
                        if (prim) {
                            prom.notas();
                        } else {
                            System.out.println("Debes ingresar los ID Primero");
                        }

                        break;

                    case 3:
                        if (gen) {
                            prom.gener();
                        } else {
                            System.out.println("Debe ingresar los datos primero");
                        }
                        break;
                    case 4:
                        mutr = true;
                        usu.main(null);

                        break;
                    default:
                        System.out.println("TIENES QUE INGRESAR UN NUMERO ENTRE 1 y 4");
                        System.out.println("");
                }
            } catch (Exception ex) {
                System.out.println("SOLO SE DEBE INGRESAR UN VALOR NUMERICO");
                st.next();

            }
        } while (!mutr);

    }

    public static int i,j;
    public static int x[][] = new int[6][6];
    public static int y[][] = new int[4][4];
    public static int id[] = new int[6];

    static void tabla() {

        for (i= 0; i< id.length; i++) {

            System.out.println("Ingresa el Id"+(i+1));
            id[i] = st.nextInt();

            System.out.println("");
        }
        

           // System.out.println(" " + id[i] + "  ");
            System.out.println("");
            System.out.println("Id Ingresados!");
        

    }

    static void notas() {
        
        
        
        for (i = 0; i <6; i++) {
            for (j = 0; j <6; j++) {
             System.out.println("Ingresa las Notas de " + id[i] + " ");
             x[i][j] = st.nextInt();
             
    
            }
            System.out.println("");
        }
        
    }

    static void gener() {
        for(i=0;i<x.length; i++){
        for(j=0;j<x.length;j++){
        
                
            
             
             System.out.print("   "+x[i][j]+"  ");
    
         }
           System.out.println("  ");
         
         
        }
       }
    }
