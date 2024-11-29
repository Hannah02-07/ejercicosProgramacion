import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class ejercicio9 {

   
    @SuppressWarnings("unchecked")
    public static List<Map<String, Object>> transformadorDatos(Map<String, List<?>> data) {

        List<Map<String, Object>> datos = new ArrayList<>();

        
        List<String> nombres = (List<String>) data.get("nombres"); 
        List<Integer> edades = (List<Integer>) data.get("edades"); 

        
        for (int i = 0; i < nombres.size(); i++) {
            Map<String, Object> persona = new HashMap<>(); 
            persona.put("id", String.valueOf(i + 1)); 
            persona.put("nombre", nombres.get(i)); 
            persona.put("edad", edades.get(i)); 

            datos.add(persona); 
        }

        return datos; 
    }

    public static void main(String[] args) {
        
        Map<String, List<?>> data = new HashMap<>();

        
        data.put("nombres", List.of("Nana", "Julian")); 
        data.put("edades", List.of(17,17 ));

       
        List<Map<String, Object>> resultado = transformadorDatos(data);

       
        System.out.println(resultado);
    }
}
