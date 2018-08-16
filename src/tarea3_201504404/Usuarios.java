
package tarea3_201504404;

import java.util.Arrays;
import java.util.Scanner;


public class Usuarios {
   public static void main(String[] args) {
   
  }
       
  public static Scanner entrada= new Scanner(System.in);
  public static int menu; 
  
  public static  void usuario (){
    
    
        

        
        System.out.println("-----USUARIO-----");
        System.out.println("1.- Ingresar usuarios");
        System.out.println("2.- Mostrar Usuarios Ascendente");
        System.out.println("3.- Mostrar Usuarios Descendente");
        System.out.println("4.- Menu Principal");
        menu=entrada.nextInt();
        
        Usuarios usu=new Usuarios();
        
       switch(menu){
           
           case 1:
               Usuarios.usua();
               
       }
     
       }
    
       
       public static String usua (){
        
         String usuarios []= new String[5];
         String nombres; 
            
         for ( int i = 0; i <usuarios.length; i++) {
          System.out.println("Usuario:  "+i);
          nombres=entrada.nextLine();
          usuarios[i]=nombres;
          
            
         }
       return null;
      
      
    
       }

    }
