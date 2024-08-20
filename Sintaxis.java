
//Sitio web oficial de Java: https://www.java.com/

// Comentarios de una sola línea (//): Para comentarios breves.

/* Comentarios de múltiples líneas (
ejemplo de que hay mas lineas): 
Para comentarios más largos que abarcan varias líneas. */

/** // Comentarios de documentación : Para generar documentación API, describiendo clases, métodos y campos en detalle. */

// Operadores Aritmeticos 


public class Sintaxis {
    private static final String CONSTANTE = "Esto es una constante a nivel de clase";
    public static void main(String[] args) {
    // datos primitivos

    //tipodeDato//Nombre//Valor

        //Variables tipo Numerico

        float flotante = 0.0f;

        double varDouble = 6.4d;

        byte b = 100;

        short s = 1000;

        int i = 100000;

        long l = 10000000000L;

        // Variables tipo char

        char caracter = '\u0000';

        // Variables tipo Booleano

        boolean bool = true;

        boolean booleano = false;

        // Variables tipo Texto

        String cadena ="Cadena de texto Java";

        //imprimir por pantalla 

        System.out.println("Hola " + cadena + "Mundo !");
        System.out.println("Estos son los valores numericos" + flotante +" " + varDouble +" "+ b +" " + i +" "+ l );
        System.out.println(bool);
        System.out.println(booleano);


        //Operadores Aritmeticos 

        int Suma = 10 + 3 ;
        int Resta = 10 - 3 ;
        int Multiplicacion = 10 * 3 ;
        int Divicion = 10 / 3 ;
        int Modulo = 10 % 3 ;
        int Exponente = (int) Math.pow(10,3) ;

        System.out.println( "Suma 10 + 3 = " + Suma);
        System.out.println( "Resta 10 - 3 = " + Resta);
        System.out.println( "Multiplicacion  10 * 3 = " + Multiplicacion);
        System.out.println( "Divicion 10 / 3 = " + Divicion);
        System.out.println( "Modulo 10 % 3 = " + Modulo);
        System.out.println("Exponente 10 ^ 3 = " + Exponente);

        // Operadores Comparacion

        boolean igualdad = 10 == 3;
        boolean Desigualdad = 10 != 3;
        boolean Mayor_que = 10 > 3;
        boolean Menor_que = 10 < 3;
        boolean Mayor_O_igual_que = 10 >= 3;
        boolean Menor_O_igual_que = 10 <= 3;

        System.out.println("Igualdad 10 == 3 es " +igualdad);
        System.out.println("Desigualdad 10 != 3 es " + Desigualdad);
        System.out.println("Mayor que 10 > 3 es " + Mayor_que);
        System.out.println("Menor que 10 < 3 es " + Menor_que);
        System.out.println("Mayor que 10 >= 3 es " + Mayor_O_igual_que);
        System.out.println("Menor que 10 <= 3 es " + Menor_O_igual_que);

        //Operadorees Logicos
        //and Verdadero solo si ambos operandos son verdaderos.
        //or Verdadero si al menos uno de los operandos es verdadero.
        //not Invierte el valor de la expresión booleana


        boolean EsteAnd = 10 + 3 == 13 && 5 - 1 == 4;
        System.out.println("AND && 10 + 3 == 13 and 5 - 1 == 4 es " + EsteAnd );
        boolean EsteOr = 10 + 3 == 13 || 5-1 == 2;
        System.out.println("OR || 10 + 3 == 13 OR 5 - 1 == 2 es " + EsteOr);
        boolean Estenot = !EsteOr;
        System.out.println("NOT ! 10 + 3 == 13 ! 5 - 1 == 2 es " + Estenot);


    }


}
