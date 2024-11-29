import java.util.Arrays;  

public class ejercicio3u2 {

    
    public static void modificarArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;  
        }
       
        System.out.println("dentro del metodo: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5};
        
        
        System.out.println("antes de modificar: " + Arrays.toString(numeros));

        
        modificarArray(numeros);

     
        System.out.println("despues de modificar: " + Arrays.toString(numeros));
    }
}
