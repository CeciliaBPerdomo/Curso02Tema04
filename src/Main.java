public class Main {
    public static void main(String[] args) {
        // Ejercicio 01
        comparacion(5);
        comparacion(-4);

        // Ejercicio 02
        bucleNumero(1);

        // Ejercicio 03
        bucleDoWhile(1);

        // Ejercicio 04
        bucleFor();

        // Ejercicio 05
        estaciones("Primavera");
        estaciones("Agosto");
    }

    // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    // Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    public static void comparacion(int a) {
        System.out.println("-----------------------------------------------------");
        System.out.println("Ejercicio 01");
        if (a >= 0){
            System.out.println("El número " + a + " es positivo");
        } else {
            System.out.println("El número " + a + " es negativo");
        }
    }

    // Crea un bucle While, este bucle tendrá que tener como condición que la variable numero While
    // sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    // Incrementar el valor de la variable en uno cada vez que se ejecute.
    // Mostrarlo por pantalla cada vez que se ejecute.
    public static void bucleNumero(int numero) {
        System.out.println("-----------------------------------------------------");
        System.out.println("Ejercicio 02");
        while (numero < 3){
            System.out.println("El valor del número es: " + numero);
            numero = numero + 1;
        }
    }

    // Para el bucle Do While, deberás crear la misma estructura que en el While,
    // pero solo se debe ejecutar una vez.
    public static void bucleDoWhile(int numero){
        System.out.println("-----------------------------------------------------");
        System.out.println("Ejercicio 03");
        do {
            numero = numero + 1;
            System.out.println("El valor del número es: " + numero);
        } while(numero < 2);
    }

    // Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y
    // su condición será que la variable sea igual o menor que 3,
    // se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
    public static void bucleFor(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Ejercicio 04");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println("El valor del número es: " + numeroFor);
        }
    }

    // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones
    // del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
    // consola informando de la estación en la que está.
    // También habrá que poner un default para cuando el valor de la variable no sea una estación.
    public static void estaciones(String estacion){
        System.out.println("-----------------------------------------------------");
        System.out.println("Ejercicio 05");
        switch (estacion){
            case "Verano":
                System.out.println("La estación del año es: " + estacion);
                break;
            case "Otoño":
                System.out.println("La estación del año es: " + estacion);
                break;
            case "Invierno":
                System.out.println("La estación del año es: " + estacion);
                break;
            case "Primavera":
                System.out.println("La estación del año es: " + estacion);
                break;
            default:
                System.out.println(estacion + ", no es una estación");
                break;
        }
    }
}