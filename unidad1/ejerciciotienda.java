
public class ejerciciotienda
{
    public static void main(String[] args) {
        double descuento = 0.85;
        final int CAMISETA = 25;
        final int PANTALONES = 30;
        
        double totalPagar = ((CAMISETA + PANTALONES) * descuento) ;
        System.out.println("El total a pagar de las prendas es: $" + totalPagar);
        
        
        double descuentoCamiseta = CAMISETA*descuento;
        descuento += 0.1;
        double total = descuentoCamiseta + (descuentoCamiseta*descuento);
        
        System.out.println("El precio de las camisas es: $" + total);
        
        
        
    }
}
