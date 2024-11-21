

import simulador.entrenador.Entrenador;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntrenadorTest {

    private Entrenador entrenador;
    private Pokemon pikachu;
    private Pokemon charmander;

    @BeforeEach
    public void setUp() {
        // Configuración inicial para cada prueba
        entrenador = new Entrenador("Ash Ketchum");
        pikachu = new Pokemon("Pikachu", 100, 50, TipoPokemon.ELECTRICO) {};
        charmander = new Pokemon("Charmander", 100, 40, TipoPokemon.FUEGO) {};
    }

    @Test
    public void testAgregarPokemon() {
        // Agregamos a Pikachu al equipo del entrenador
        entrenador.agregarPokemon(pikachu);
        // Verificamos que el entrenador ahora tiene 1 Pokémon en su equipo
        assertEquals(1, entrenador.getPokemones().size(), "El entrenador debería tener un Pokémon.");
    }

    @Test
    public void testEntrenarPokemon() {
        // Agregar Pokémon al equipo y entrenarlo
        entrenador.agregarPokemon(pikachu);
        int saludAntesEntrenamiento = pikachu.getSalud();
        int ataqueAntesEntrenamiento = pikachu.getPuntosDeAtaque();

        // Entrenamos a Pikachu
        entrenador.entrenarPokemon(pikachu);

        // Verificamos que las estadísticas del Pokémon hayan mejorado
        assertTrue(pikachu.getSalud() > saludAntesEntrenamiento, "La salud de Pikachu debería haber aumentado.");
        assertTrue(pikachu.getPuntosDeAtaque() > ataqueAntesEntrenamiento, "Los puntos de ataque de Pikachu deberían haber aumentado.");
    }

    @Test
    public void testMostrarPokemones() {
        // Agregar Pokémones y verificar que se muestran correctamente
        entrenador.agregarPokemon(pikachu);
        entrenador.agregarPokemon(charmander);

        // Verificamos que el tamaño de la lista de Pokémones del entrenador sea 2
        assertEquals(2, entrenador.getPokemones().size(), "El entrenador debería tener dos Pokémones.");

        // Aquí se puede utilizar un `System.out` o un mock para verificar que se muestra correctamente,
        // pero vamos a comprobar si la cantidad es la correcta por el momento.
    }

    @Test
    public void testPrepararBatalla() {
        // Agregar un Pokémon al equipo
        entrenador.agregarPokemon(pikachu);
        // Verificamos que el Pokémon preparado para la batalla sea Pikachu
        Pokemon pokemonSeleccionado = entrenador.prepararBatalla();
        assertEquals(pikachu, pokemonSeleccionado, "El Pokémon preparado para la batalla debería ser Pikachu.");
    }

    @Test
    public void testPrepararBatallaSinPokemones() {
        // Crear un entrenador sin Pokémones
        Entrenador entrenadorVacio = new Entrenador("Brock");
        // Verificamos que no se puede preparar una batalla si no hay Pokémones
        assertNull(entrenadorVacio.prepararBatalla(), "El entrenador no tiene Pokémones disponibles para la batalla.");
    }
}
