
package comandoentrada;

import java.util.Scanner;


public class ComandoEntrada {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); //objeto teclado foi criado para ler os dados que serão
                                                  //digitados pelo usuário
        System.out.println("Informe o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Informe a nota do aluno");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
       
    }
    
}
