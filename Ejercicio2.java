/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Ejercicio2 {
    public static void main(String[] args) {
       int n = 50; //establece que quiero calcular los primeros 50 numeros
       long[] fib = new long[n];
       fib[0] = 0;
       fib[1] = 1;

       for( int i = 2; i < n; i++){
        fib[i] =fib[i - 1] + fib[i - 2];
       }
       for(int i = 0; i < n; i++){
        System.out.println(fib[i]);
       }
    }
}
