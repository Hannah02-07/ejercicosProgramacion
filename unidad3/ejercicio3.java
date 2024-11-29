import java.text.Normalizer;
import java.text.Normalizer.Form;

public class ejercicio3 {

    
    public static boolean esIsograma(String palabra) {

        
        if (palabra.isEmpty()) {
            return true; 
        }

        if (palabra.contains(" ")) {
            return false;
        }

        
        palabra = SinAcentos(palabra).toLowerCase();

        
        char[] caracteresPalabra = palabra.toCharArray();

        
        for (int i = 0; i < caracteresPalabra.length; i++) {
            for (int j = i + 1; j < caracteresPalabra.length; j++) {
                if (caracteresPalabra[i] == caracteresPalabra[j]) {
                    return false; 
                }
            }
        }

       
        return true;
    }

    
    public static String SinAcentos(String palabra) {
        
        String palabraSinAcentos = Normalizer.normalize(palabra, Form.NFD);
        
        return palabraSinAcentos.replaceAll("[^\\p{ASCII}]", "");
    }

    
    public static void main(String[] args) {
        System.out.println(esIsograma("")); 
        System.out.println(esIsograma("cama")); 
        System.out.println(esIsograma("canción")); 
        System.out.println(esIsograma("QuEsO")); 
        System.out.println(esIsograma("GATITOS")); 
        System.out.println(esIsograma("hola profesor")); 
    }
}
