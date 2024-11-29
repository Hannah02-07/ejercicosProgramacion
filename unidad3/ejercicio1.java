import java.util.ArrayList;
import java.util.HashSet;
 
class Persona {
    String nombre;  
    String apellido;   
    String pais;    
    String continente;
    int Edad;        
    String idioma;   
    String saludo;   

    
    public Persona(String nombre, String apellido, String pais, String continente, int Edad, String idioma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.continente = continente;
        this.Edad = Edad;
        this.idioma = idioma;
        this.saludo = ""; 
    }
}

public class ejercicio1 {

    
    public static boolean isMeetup(ArrayList<Persona> persona) {
        boolean africa = false, americas = false, asia = false, europe = false, oceania = false;

        
        for (Persona p : persona) {
            switch (p.continente) {
                case "Africa":
                    africa = true;
                    break;
                case "Americas":
                    americas = true;
                    break;
                case "Asia":
                    asia = true;
                    break;
                case "Europe":
                    europe = true;
                    break;
                case "Oceania":
                    oceania = true;
                    break;
            }
        }

        
        return africa && americas && asia && oceania && europe;
    }

    
    public static int javascriptDevelopers(ArrayList<Persona> persona) {
        int javasriptContador = 0;

        
        for (Persona javaPerson : persona) {
            if (javaPerson.idioma.equals("JavaScript") && javaPerson.continente.equals("Europe")) {
                javasriptContador++;
            }
        }

        return javasriptContador;
    }

    
    public static HashSet<String> idiomaRepresentado(ArrayList<Persona> persona) {
        HashSet<String> idioma = new HashSet<>();

      
        for (Persona idiomaPersona : persona) {
            idioma.add(idiomaPersona.idioma);
        }

        return idioma;
    }

    
    public static ArrayList<Persona> addGreeting(ArrayList<Persona> persona) {
        for (Persona persona2 : persona) {
            persona2.saludo = "Hi " + persona2.nombre + ", what do you like the most about " + persona2.idioma + "?";
        }

        return persona;
    }

    public static void main(String[] args) {

       
        ArrayList<Persona> persona = new ArrayList<>();
        persona.add(new Persona("Fatima", "A.", "Algeria", "Africa", 25, "JavaScript"));
        persona.add(new Persona("Agustín", "M.", "Chile", "Americas", 37, "C"));
        persona.add(new Persona("Jing", "X.", "China", "Asia", 39, "Ruby"));
        persona.add(new Persona("Laia", "P.", "Andorra", "Europe", 55, "Ruby"));
        persona.add(new Persona("Oliver", "Q.", "Australia", "Oceania", 65, "PHP"));

       
        System.out.println("¿Existe un representante en cada continente? " + isMeetup(persona));
        System.out.println();

       
        System.out.println("¿Cuántos JavaScript developers de Europa existen? " + javascriptDevelopers(persona));
        System.out.println();

        
        addGreeting(persona);

        
        for (Persona p : persona) {
            System.out.println(p.saludo);
        }
        System.out.println();

        
        System.out.println("Lista de lenguajes: " + idiomaRepresentado(persona));
    }
}