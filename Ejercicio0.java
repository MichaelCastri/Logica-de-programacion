
/* Ejercicio #0
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 * - Ejercicio realizado he agregado la i para visualizar el numero mas la palabra. En todo caso quitar la "i+"" en los m
 */


public class Ejercicio0{
    public static void main(String[] args) {
    for(int i = 1; i <= 100; i++){
        if(i % 3 == 0 && i % 5 == 0){
            System.out.println(i + " fizzBuzz");
        }
    else if( i % 3 == 0){
        System.out.println(i + " fizz");
    } else if( i % 5 == 0 ){
        System.out.println(i + " Buzz");
    }  else {
        System.out.println(i); }
    }
    }
}