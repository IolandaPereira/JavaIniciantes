
package operadorlogico;


public class OperadorLogico {

    
     
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado;
        resultado = (x<y && y==z) ? true : false;
        System.out.println(resultado);
    }
    
}
