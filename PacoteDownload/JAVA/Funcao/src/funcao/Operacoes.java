
package funcao;

public class Operacoes {
   
    public static String contador (int inicio, int fim){
        String s = ""; //a String s começa vazia
            for (int c=inicio; c<=fim; c++){
                s= s + c + " ";
            }
           return s;
    } 
        
}
