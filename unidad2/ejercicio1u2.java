public class ejercicio1u2 {

    
    public static void intercambiar(int a, int b) {
        int tempA = a; 
        a = b;         
        b = tempA;     
        System.out.println("dentro del metodo: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        
        int numero1 = 5;
        int numero2 = 10;

        System.out.println("Antes de llamar al método: numero 1 = " + numero1 + ", numero 2 = " + numero2);

        intercambiar(numero1, numero2);

        System.out.println("Después de llamar al método: numero 1 = " + numero1 + ", numero2 = " + numero2);
    }
}