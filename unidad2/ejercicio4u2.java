public class ejercicio4u2 {

    public static int incremento(int numero) {
        numero += 1;  
        System.out.println("Dentro del método: x = " + numero);
        return numero;  
    }

    public static void main(String[] args) {
        int numero = 5;  

     
        numero = incremento(numero);

       
        System.out.println("Después de llamar al método: numero = " + numero);
    }
}
