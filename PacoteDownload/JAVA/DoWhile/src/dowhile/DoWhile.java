
package dowhile;

import java.util.Scanner;


public class DoWhile {

    
    public static void main(String[] args) {
        /*int n = 10;
        
        do {
            n++;
            System.out.println(n);
        } while (n<=12); */
       
        Scanner teclado = new Scanner (System.in);
        int n, soma = 0;
        String resposta;
        
        
        
        do {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            soma = soma+n;
            System.out.println(" Deseja continuar? Sim ou Não");
            resposta = teclado.next();      
        } while (resposta.equals("Sim"));
        
       
        System.out.println(" Soma= "+soma);
    }
    
}
