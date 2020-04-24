
package exemploswitch;

import java.util.Scanner;


public class ExemploSwitch {

    
    public static void main(String[] args) {
       /* char indice = 'b';
        String resultado = "";
        
        switch (indice){
            case 'a':
                resultado = resultado + 'a';
                break;
            case 'b':
                resultado = resultado + 'b';
                break;
            case 'c':
                resultado = resultado + 'c';
                break;
            default:
                resultado = resultado + 'd';
                break;   
        }
            System.out.println(resultado);*/
         
       Scanner teclado = new Scanner (System.in);
       System.out.println(" Digite seu nome:");
       String nome = teclado.nextLine();
       
       switch (nome){
           case "Heloisa":
               System.out.println("Irmã");
               break;
           case "Iolanda":
               System.out.println("Eu ;p");
               break;
           case "Claudia":
               System.out.println("Mãe");
               break;
           default:
               System.out.println("Intruso");
               break;
       }
    }
}
    
        
          
           
           
           
           
       
    

