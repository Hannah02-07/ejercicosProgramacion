import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejercicio2 {
    public static <T> List<T> elementosRepetidos(List<T> list, int n) {
        Map<T, Integer> contadorElementos = new HashMap<>();

        for (T elemento : list) {
            contadorElementos.put(elemento, contadorElementos.getOrDefault(elemento, 0) + 1);
        }
        
        List<T> resultado = new ArrayList<>();
        for (Map.Entry<T, Integer> entry : contadorElementos.entrySet()) {
            if (entry.getValue() == n) {
                resultado.add(entry.getKey());
            }
        }
        
        return resultado;
    }

    public static void main(String[] args) {
        List<String> lista1 = List.of("A", "B", "A", "C", "C", "C");
        System.out.println(elementosRepetidos(lista1, 2));

        List<Integer> lista2 = List.of(1, 2, 3, 1, 2);
        System.out.println(elementosRepetidos(lista2, 2));
    }
}
