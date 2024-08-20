/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */




public class Ejercicio3 {
    public static void main(String[] args) {
      for(int i = 1; i <=100; i++)  {   //trabaja desde 1 hasta 100
        if (isPrime(i)){                // verifica cada numero llamando el metodo "es primo"
            System.out.println(i);      //imprime el numero por pantalla si es primo ,si la condicion se cumple
        }
      }
    }
    public static boolean isPrime(int num){
        if (num <=1){                    //
            return false;
        }
        for(int i =2; i<=Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
       }
}
