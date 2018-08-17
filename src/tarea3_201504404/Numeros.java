
package tarea3_201504404;

import java.util.Scanner;


public class Numeros {
    public static void main(String[] args) {
   
  }
  public static Scanner entrada= new Scanner(System.in);
  public static int menu; 
  
  public static  void contador (){
    
       boolean menupr=false;
       boolean most=false;
        
           
      do{ 
      try{  
        System.out.println("-----Contador de Digitos Repetidos-----");
        System.out.println("1.- Ingresar Números");
        System.out.println("2.- Mostrar de Mayor a Menor");
        System.out.println("3.- Menu Principal");
        menu=entrada.nextInt();
           
           Tarea3_201504404 usu=new Tarea3_201504404();
           Numeros numb=new Numeros();
    
     switch(menu){
        case 1:
            most=true;
            
            Numeros.numero();
            break;
        case 2:
                if (most){
            
            System.out.println("----Ingrese los Números----");
            Contador.buscar();
            }
            else{   
             System.out.println("debes ingresar los Números primero");
             System.out.println("");
            }
             break;
         
         case 3:
            menupr=true;
            usu.main(number);
            break;
            
         default:
               System.out.println("TIENES QUE INGRESAR UN NUMERO ENTRE 1 y 4");
               System.out.println("");
          } 
        }catch (Exception e) {
            System.out.println("SOLO SE DEBE INGRESAR UN VALOR NUMERICO");
             entrada.next();
        
    }
}while (!menupr);          
          
  }
    public static  String number[]=new String[1];
    public static String numbr;

     public static void numero (){
       for ( int i = 0; i <number.length; i++) {
       System.out.println("Ingrese el Número Entero: ");
        numbr=entrada.next();
        number[i]=numbr;
}
     }
}