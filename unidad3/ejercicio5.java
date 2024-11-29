import java.util.HashMap;

public class ejercicio5 {

   
    public static boolean esPalindromo(int numero) {

        
        String numeroString = String.valueOf(numero);

        
        HashMap<Character, Integer> contarDigitos = new HashMap<>();

        
        for (char digito : numeroString.toCharArray()) {
            contarDigitos.put(digito, contarDigitos.getOrDefault(digito, 0) + 1);
        }

        String numeroInvertido = new StringBuilder(numeroString).reverse().toString();
        if (numeroString.equals(numeroInvertido)) {
            return true; 
        }

        // Si no es un palíndromo directo, verificamos si puede reordenarse para formar uno
        int impares = 0;
        // Contamos la cantidad de dígitos con frecuencia impar
        for (int frecuencia : contarDigitos.values()) {
            if (frecuencia % 2 != 0) { // Un palíndromo puede tener como máximo un dígito con frecuencia impar
                impares++;
            }
        }

        // Si hay 0 o 1 frecuencias impares, el número puede formar un palíndromo
        return impares <= 1;
    }

    // Método principal para probar el funcionamiento del programa
    public static void main(String[] args) {

        System.out.println("¿El número 2 es palíndromo? " + esPalindromo(2));
        System.out.println("¿El número 3421 es palíndromo? " + esPalindromo(3421));
        System.out.println("¿El número 2232 es palíndromo? " + esPalindromo(2232));
        System.out.println("¿El número 2072007 es palíndromo? " + esPalindromo(2072007));
        System.out.println("¿El número 5115 es palíndromo? " + esPalindromo(5115));
    }
}