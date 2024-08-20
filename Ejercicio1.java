/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */



public class Ejercicio1 {
    public static boolean areAnagrams(String word1, String word2) { //recibe por parametro 2 palabras
        if (word1.equals(word2)) {  // compara las palabras si son iguales y retorna falso

            return false;
        }
        char[]chars1 = word1.toCharArray(); //almacena las palabras en un Array de letrasen chars1
        char[]chars2 = word2.toCharArray(); //almacena las palabras en un Array de letrasen chars2

        java.util.Arrays.sort(chars1); // sort Ordena los elementos de una array de forma ascendente( Z, A, R, C )=> (A,C,R,Z)
        java.util.Arrays.sort(chars2);

        return java.util.Arrays.equals(chars1, chars2); // ya igualados los array, se comparan 
    }

    //inicializacion
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));  // true
        System.out.println(areAnagrams("hello", "world"));    // false
}
}