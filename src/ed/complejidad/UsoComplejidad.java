package ed.complejidad;

public class UsoComplejidad {
    /*
     * Aquí se correrá el código de las operaciones
     * 
     */
public static void main (String[] args){
    IComplejidad c = new Complejidad ();
    System.out.println(c.tPascalRec(5, 2));
    int s = 1;
    int p = 2;
    System.out.println (" Resultado de Pascal: " + s);
    System.out.println (" Resultado de Fibonacci: " + p);
    System.out.println (" Número de operaciones que se realizaron: " + p);
    }
}
