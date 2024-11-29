public class breakContinue {
    public static void main(String[]args) {
        // salir de un ciclo en un numeroespecifico
        char[][] tablero = {
            {'X', 'O', 'X'},
            {'O', 'X', ' '},
            {' ', 'O', ' '}
        };
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        // saltar iteraciones
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue; // Salta la impresión de números divisibles por 3
            }
            System.out.println(i);
        }
    }
    
}