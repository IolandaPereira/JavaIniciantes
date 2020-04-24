
package vetor02;


public class Vetor02 {

    public static void main(String[] args) {
        int n[] = {3,2,8,7,5,4};
        
        //percorrendo o vetor
       /* for (int i=0; i<=5; i++){
            System.out.println(" Vetor na posição " + i + "= " +n[i]);
        }*/
        
       for (int i=0; i<=n.length-1; i++){
           System.out.println(" Vetor na posição " + i + "= " +n[i]);
       }
        
    }
    
}
