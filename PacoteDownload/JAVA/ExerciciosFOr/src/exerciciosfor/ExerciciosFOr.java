
package exerciciosfor;

import java.util.Scanner;


public class ExerciciosFOr {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println(" Informe a quantidade de alunos: ");
        int qtd = teclado.nextInt();
        float nota, soma=0, media=0;
        
        for (int x=1; x<=qtd ; x++){
            System.out.println(" Informe a nota do aluno " + x);
            nota = teclado.nextFloat();
            soma = soma+nota;
        }
        
        media = soma/qtd;
        System.out.println(" Média das notas dos alunos: "+ media);
               
        
        
        
    }
    
}
