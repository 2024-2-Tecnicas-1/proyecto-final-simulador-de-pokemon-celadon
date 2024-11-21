
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
        // Inicialización de entrenadores
        entrenador1 = new Entrenador("Ash Ketchum");
        entrenador2 = new Entrenador("Misty");

        // Inicialización de Pokémon
        pokemon1 = new Pokemon("Pikachu", 100, 50, TipoPokemon.ELECTRICO) {};
        pokemon2 = new Pokemon("Squirtle", 100, 40, TipoPokemon.AGUA) {};

        // Asignación de Pokémon a los entrenadores
        entrenador1.agregarPokemon(pokemon1);
        entrenador2.agregarPokemon(pokemon2);
    }

    @Test
    public void testFinDeBatallaCuandoPokemon2Pierde() {
        // Crear la batalla
        Batalla batalla = new Batalla(entrenador1, entrenador2);

        // Realizar daño suficiente a Squirtle para que pierda
        pokemon2.recibirDanio(150);

        // Iniciar la batalla
        batalla.iniciarBatalla();

        // Verificar que Squirtle haya sido derrotado
        assertTrue(pokemon2.getSalud() <= 0, "Squirtle debería haber sido derrotado.");
    }

    @Test
    public void testFinDeBatallaCuandoPokemon1Pierde() {
        // Crear la batalla
        Batalla batalla = new Batalla(entrenador1, entrenador2);

        // Realizar daño suficiente a Pikachu para que pierda
        pokemon1.recibirDanio(150);

        // Iniciar la batalla
        batalla.iniciarBatalla();

        // Verificar que Pikachu haya sido derrotado
        assertTrue(pokemon1.getSalud() <= 0, "Pikachu debería haber sido derrotado.");
    }

    @Test
    public void testBatallaConAmbosPokemonesActivos() {
        // Crear la batalla
        Batalla batalla = new Batalla(entrenador1, entrenador2);

        // Iniciar la batalla sin que los Pokémon reciban daño
        batalla.iniciarBatalla();

        // Verificar que ambos Pokémon siguen con salud
        assertTrue(pokemon1.getSalud() > 0, "Pikachu debería seguir con salud.");
        assertTrue(pokemon2.getSalud() > 0, "Squirtle debería seguir con salud.");
    }
}
