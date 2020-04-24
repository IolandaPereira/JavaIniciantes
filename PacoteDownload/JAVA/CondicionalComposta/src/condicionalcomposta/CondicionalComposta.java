
package condicionalcomposta;

import java.util.Scanner;


public class CondicionalComposta {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o seu ano de nascimento: ");
        int ano_nascimento = teclado.nextInt();
        int idade = 2020 - ano_nascimento;
        System.out.println("Idade:" + idade);
            if (idade>=18){
                System.out.println(" Maior de idade");
            }
            else {
                System.out.println(" Menor de idade");
            }
    }
    
}
