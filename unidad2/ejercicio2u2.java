
class Rectangulo {
    int ancho;
    int alto;


    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class ejercicio2u2 {

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;  
        r.alto = 30;   
        System.out.println("dentro del metodo: ancho = " + r.ancho + ", alto = " + r.alto);
    }

    public static void main(String[] args) {
        
        Rectangulo Rectangulo = new Rectangulo(10, 20);
        
       
        System.out.println("antes de modificar: ancho = " + Rectangulo.ancho + ", alto = " + Rectangulo.alto);

        modificarRectangulo(Rectangulo);

        
        System.out.println("despues de modificar: ancho = " + Rectangulo.ancho + ", alto = " + Rectangulo.alto);
    }
}