import java.util.ArrayList;
import java.util.HashSet;

public class ejercicio7 {

    
    public static <T> HashSet<T> repetidosPares(ArrayList<T> elementos) {
        
        HashSet<T> totalRepetidos = new HashSet<>();

        
        for (T elem : elementos) {
            int contador = 0;

            
            for (T e : elementos) {
                if (e.equals(elem)) { 
                    contador++;
                }
            }

            
            if (contador % 2 == 0) {
                totalRepetidos.add(elem);
            }
        }

        
        return totalRepetidos;
    }

    public static void main(String[] args) {
        
        ArrayList<String> elementosString = new ArrayList<>();
        elementosString.add("A");
        elementosString.add("B");
        elementosString.add("A");
        elementosString.add("C");
        elementosString.add("C");
        elementosString.add("C");
        elementosString.add("C");

        
        System.out.println("Strings repetidos: " + repetidosPares(elementosString));

        
        ArrayList<Integer> elementosInt = new ArrayList<>();
        elementosInt.add(1);
        elementosInt.add(2);
        elementosInt.add(3);
        elementosInt.add(1);
        elementosInt.add(2);

        
        System.out.println("Enteros repetidos: " + repetidosPares(elementosInt));
    }
}
