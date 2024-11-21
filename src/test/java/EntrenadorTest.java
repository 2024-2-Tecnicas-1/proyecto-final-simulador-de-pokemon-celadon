
import simulador.pokemon.*;
import simulador.entrenador.Entrenador;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntrenadorTest {

    private Entrenador entrenador;
    private Pokemon bellsprout;
    private Pokemon psyduck;

    @BeforeEach
    public void setUp() {
        // Configuración inicial para cada prueba
        entrenador = new Entrenador("Ash Ketchum");
        bellsprout = new Bellsprout();
        psyduck = new Psyduck();
    }

    @Test
    public void testAgregarPokemon() {

        entrenador.agregarPokemon(bellsprout);
        // Verificacion
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
        
        entrenador.agregarPokemon(psyduck);
        entrenador.agregarPokemon(bellsprout);

        
        assertEquals(2, entrenador.getPokemones().size(), "El entrenador debería tener dos Pokémones.");

        
    }

    @Test
    public void testPrepararBatalla() {
        
        entrenador.agregarPokemon(bellsprout);
        
        Pokemon pokemonSeleccionado = entrenador.prepararBatalla();
        assertEquals(bellsprout, pokemonSeleccionado, "El Pokémon preparado para la batalla debería ser Pikachu.");
    }

    @Test
    public void testPrepararBatallaSinPokemones() {
        
        Entrenador entrenadorVacio = new Entrenador("Brock");
       
        assertNull(entrenadorVacio.prepararBatalla(), "El entrenador no tiene Pokémones disponibles para la batalla.");
    }
}
