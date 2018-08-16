
package tarea3_201504404;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class Tarea3_201504404 {

    public static Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
       
        boolean salir=false;
        boolean mostrar=false;
        
        do {            
        try {
           
        int menu;
        System.out.println("-----MENU-----");
        System.out.println("1.- Usuarios");
        System.out.println("2.- Contador de Digitos Repetidos");
        System.out.println("3.- Tres Numeros de mayor a menor");
        System.out.println("4.- Calcular Promedio");
        System.out.println("5.- Salir");
        System.out.println("Seleccione una opción:  ");
        menu=entrada.nextInt();
        
        Usuarios usu=new Usuarios();
        
       switch(menu){
       
        //llamar a la clase Usuarios   
       case 1: 
          
           usu.usuario();
           System.out.println(" ");
       break;         
      
       
       case 5:
            salir=true;
           System.out.println("");
           break;
         //excepcion solo valores de 1 y 5
       default:
            System.out.println("TIENES QUE INGRESAR UN NUMERO ENTRE 1 y 5");
       }
           //excepcion de solo ingresar numero y no letra 
        } catch (Exception e) {
            System.out.println("SOLO SE DEBE INGRESAR UN VALO NUMERICO!");
              entrada.next();
             System.out.print("");
      
             
  }
       
        } 
    while(!salir);
  }

}   

