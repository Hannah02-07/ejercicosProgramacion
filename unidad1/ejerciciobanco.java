
public class ejerciciobanco
{
    public static void main(String[] args) { 
        
        int dineroCuenta = 1000;
        final int RETIRAR = 200;
        
        //Semana1
        dineroCuenta -= RETIRAR;
        System.out.println("Saldo de la semana 1: $" + dineroCuenta);
        
        //Semana2
        dineroCuenta -= RETIRAR;
        System.out.println("Saldo de la semana 2: $" + dineroCuenta);
        
        //Semana3
        dineroCuenta -= RETIRAR;
        System.out.println("Saldo de la semana 3: $" + dineroCuenta);
        
        //Semana4
        dineroCuenta -= RETIRAR;
        System.out.println("Saldo de la semana 4: $" + dineroCuenta);
        System.out.println();
        
        System.out.println("Saldo al final del mes: $" + dineroCuenta);
        
        
    }
}