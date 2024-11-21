
import simulador.entrenador.Entrenador;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;
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

        
        pokemon1 = new Pokemon("Pikachu", 100, 50, TipoPokemon.ELÉCTRICO, TipoPokemon.NULL) {};
        pokemon2 = new Pokemon("Squirtle", 100, 40, TipoPokemon.AGUA, TipoPokemon.NULL) {};

        
        entrenador1.agregarPokemon(pokemon1);
        entrenador2.agregarPokemon(pokemon2);
    }

    @Test
    public void testFinDeBatallaCuandoPokemon2Pierde() {
        
        Batalla batalla = new Batalla(entrenador1, entrenador2);

        
        pokemon2.recibirDanio(150);

        
        batalla.iniciarBatalla();

        
        assertTrue(pokemon2.getSalud() <= 0, "Squirtle debería haber sido derrotado.");
    }

    @Test
    public void testFinDeBatallaCuandoPokemon1Pierde() {
        
        Batalla batalla = new Batalla(entrenador1, entrenador2);

        
        pokemon1.recibirDanio(150);

        
        batalla.iniciarBatalla();

        
        assertTrue(pokemon1.getSalud() <= 0, "Pikachu debería haber sido derrotado.");
    }

    @Test
    public void testBatallaConAmbosPokemonesActivos() {
        
        Batalla batalla = new Batalla(entrenador1, entrenador2);

        
        batalla.iniciarBatalla();

        
        assertTrue(pokemon1.getSalud() > 0, "Pikachu debería seguir con salud.");
        assertTrue(pokemon2.getSalud() > 0, "Squirtle debería seguir con salud.");
    }
}
