import java.text.Normalizer;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ejercicio6 {

    
    public static String SinAcentos(String palabra) {
        System.out.println("Original: " + palabra); 
        
        String normal = Normalizer.normalize(palabra, Normalizer.Form.NFD);
        System.out.println("Normalizado (NFD): " + normal);
        Pattern pattern = Pattern.compile("\\p{M}+");
        String sinAcentos = pattern.matcher(normal).replaceAll("").toLowerCase();
        System.out.println("Sin acentos: " + sinAcentos); 
        return sinAcentos;
    }

    
    public static boolean letraTermina(String palabra1, String palabra2) {
        
        palabra1 = SinAcentos(palabra1);
        palabra2 = SinAcentos(palabra2);

        return palabra1.endsWith(palabra2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la palabra que desees:");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingresa la otra palabra:");
        String palabra2 = scanner.nextLine();

        
        boolean resultado = letraTermina(palabra1, palabra2);
        System.out.println("La palabra \"" + palabra1 + "\" " + (resultado ? "sí" : "no") + " termina con \"" + palabra2 + "\".");

        scanner.close();
    }
}
