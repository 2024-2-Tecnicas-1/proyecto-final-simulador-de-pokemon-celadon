
import java.io.ByteArrayInputStream;
import simulador.pokemon.*;
import simulador.entrenador.Entrenador;
import simulador.pokemon.Pokemon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntrenadorTest {

    private Entrenador entrenador;
    private Pokemon bellsprout;
    private Pokemon psyduck;

    @BeforeEach
    public void setUp() {

        entrenador = new Entrenador("Ash Ketchum");
        bellsprout = new Bellsprout();
        psyduck = new Psyduck();

    }

    @Test
    public void testAgregarPokemon() {

        entrenador = new Entrenador("Ash Ketchum");
        bellsprout = new Bellsprout();
        psyduck = new Psyduck();

        entrenador.agregarPokemon(bellsprout);

        assertEquals(1, entrenador.getPokemones().size(), "El entrenador debería tener un Pokémon.");
    }

    @Test
    public void testEntrenarPokemon() {

        entrenador.agregarPokemon(psyduck);
        int saludAntesEntrenamiento = psyduck.getSalud();
        int ataqueAntesEntrenamiento = psyduck.getPuntosDeAtaque();

        entrenador.entrenarPokemon(psyduck);

        assertTrue(psyduck.getSalud() > saludAntesEntrenamiento, "La salud de Pikachu debería haber aumentado.");
        assertTrue(psyduck.getPuntosDeAtaque() > ataqueAntesEntrenamiento, "Los puntos de ataque de Pikachu deberían haber aumentado.");
    }

    @Test
    public void testMostrarPokemones() {

        entrenador = new Entrenador("Ash Ketchum");
        bellsprout = new Bellsprout();
        psyduck = new Psyduck();

        entrenador.agregarPokemon(psyduck);
        entrenador.agregarPokemon(bellsprout);

        assertEquals(2, entrenador.getPokemones().size(), "El entrenador debería tener dos Pokémones.");

    }

    @Test
    public void testPrepararBatallaSinPokemones() {
        entrenador = new Entrenador("Ash Ketchum");
        entrenador.getPokemones().clear(); // 

        assertNull(entrenador.prepararBatalla(), "El entrenador no tiene Pokémones disponibles para la batalla.");
    }

    @Test
    public void testPrepararBatallaSeleccionInvalida() {
        entrenador = new Entrenador("Ash Ketchum");
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes())); // Redirige System.in a esta entrada

        assertNull(entrenador.prepararBatalla(), "La selección debería ser inválida.");
    }

    
}
