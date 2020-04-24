
package exerciciosvetor;

import java.util.Scanner;

public class ExerciciosVetor {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetA[] = new int[5];
        int vetB[] = new int[5];
        int vetC[] = new int[10];
        
        //preenchendo o vetor A
        for (int i=0; i<vetA.length; i++){
            System.out.println(" Vetor Ar: ");
            vetA[i] = teclado.nextInt();
        }
        
        //preenchendo o vetor B
        for (int i=0; i<vetB.length; i++){
            System.out.println(" Vetor B: ");
            vetB[i] = teclado.nextInt();
        }
        
        //preenchendo o vetor C
        for (int i=0; i<5; i++){
            vetC[i*2]= vetA[i];    
        }
        for (int i=0; i<5; i++){
            vetC[i*2+1]= vetB[i];    
        }
       
        //imprimindo o vetor C
        System.out.println(" Vetor C");
        for (int i=0; i<10; i++){
            System.out.print(vetC[i]+ " ");   
        }
         
        
       
    } 
}
