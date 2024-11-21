
import java.io.ByteArrayInputStream;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import simulador.batalla.Batalla;

public class BatallaTest {

    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private Pokemon pokemon1;
    private Pokemon pokemon2;

    @BeforeEach
    public void setUp() {
        
        entrenador1 = new Entrenador("Ash Ketchum");
        entrenador2 = new Entrenador("Misty");

        pokemon1 = new Bellsprout();
        pokemon2 = new Psyduck();

        entrenador1.agregarPokemon(pokemon1);
        entrenador2.agregarPokemon(pokemon2);
    }

    @Test
    public void testBatallaConEntrenadorNoInicializado() {
        
        Batalla batalla = new Batalla(null, entrenador2);
        batalla.iniciarBatalla();  

        
    }

    @Test
    public void testBatallaSinPokemones() {
        entrenador1 = new Entrenador("Ash Ketchum");
        entrenador2 = new Entrenador("Misty");
        
        
        entrenador1.getPokemones().clear();
        
        Batalla batalla = new Batalla(entrenador1, entrenador2);
        batalla.iniciarBatalla(); 
    }

    @Test
    public void testBatallaConAmbosEntrenadoresListos() {
        
        Batalla batalla = new Batalla(entrenador1, entrenador2);
        
       
        String input = "S\nS\n";  
        System.setIn(new ByteArrayInputStream(input.getBytes())); 

        
        batalla.iniciarBatalla();  

       
    }

    @Test
    public void testBatallaConPokemonesConSaludCero() {
        pokemon1 = new Bellsprout();
        
        pokemon1.setSalud(0);  
        
        Batalla batalla = new Batalla(entrenador1, entrenador2);
        batalla.iniciarBatalla();  

        
    }

    @Test
    public void testSimularBatallaYDeterminarGanador() {
        pokemon1 = new Bellsprout();
        pokemon2 = new Psyduck();
        pokemon1.setSalud(50); 
        pokemon2.setSalud(30);

       
        String input = "S\nN\nS\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes())); 

        Batalla batalla = new Batalla(entrenador1, entrenador2);
        batalla.iniciarBatalla();  

        
    }
}
