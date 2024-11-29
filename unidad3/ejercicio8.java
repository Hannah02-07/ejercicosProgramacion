import java.util.ArrayList;

public class ejercicio8 {

    
    public static ArrayList<Object> cambiarCeros(ArrayList<Object> numeros) {

       
        ArrayList<Object> total = new ArrayList<>();

       
        for (Object numero : numeros) {
            if (numero instanceof Integer && (Integer) numero != 0) {
                total.add(numero);  
            } else if (!(numero instanceof Integer)) {
                total.add(numero);  
            }
        }

        
        for (Object numero : numeros) {
            if (numero instanceof Integer && (Integer) numero == 0) {
                total.add(0);  
            }
        }

        return total;
    }

    public static void main(String[] args) {

        
        ArrayList<Object> numeros = new ArrayList<>();
        numeros.add("false");
        numeros.add(1);
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(0);
        numeros.add(1);
        numeros.add(3);
        numeros.add("a");

        
        System.out.println("lista original: " + numeros);

       
        ArrayList<Object> respuesta = cambiarCeros(numeros);

        
        System.out.println("lista con ceros al final: " + respuesta);
    }
}