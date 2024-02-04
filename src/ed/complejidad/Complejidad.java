/* Emilio Durán Tapia
 * 320301867
 * Estructura de Datos
*/

package ed.complejidad;

import java.util.Scanner;

public class Complejidad implements IComplejidad {

    private long contador;

    public long leeContador(){
        return 0;
        //Contador
    }

	public int tPascalRec(int ren, int col){
        return 0;
    }

	public int tPascalIt(int ren, int col){
        return 0;
    }
    
    public int fibonacciRec(int n){
        return 0;
    }

    public int fibonacciIt(int n){
        return 0;
    }

/*
 * Código para sucesión de fibonacci.
 */
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int numero,fibo1,fibo2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            numero = sc.nextInt();
        }while(numero<=1);
  
        System.out.println("Los " + numero + " primeros términos de Fibonacci son:");                 

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }

/*
 * Código para triángulo de pascal.
 */
    public class TrianguloPascal {    
        public static void main(String[] args) {        
            Scanner input=new Scanner(System.in);
            System.out.print("Ingrese un número: ");
            int rows=input.nextInt();        
            for(int i =0;i<rows;i++) {
                int number = 1;
                System.out.format("%"+(rows-i)*2+"s","");
                for(int j=0;j<=i;j++) {
                    System.out.format("%4d",number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }    
    }
}
