

import simulador.pokemon.TipoPokemon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipoPokemonTest {

    @Test
    public void testMultiplicadorFuegoContraPlanta() {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(TipoPokemon.FUEGO, TipoPokemon.PLANTA);
        assertEquals(2.0, multiplicador, "Fuego debería ser 2x efectivo contra Planta.");
    }

    @Test
    public void testMultiplicadorAguaContraFuego() {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(TipoPokemon.AGUA, TipoPokemon.FUEGO);
        assertEquals(2.0, multiplicador, "Agua debería ser 2x efectivo contra Fuego.");
    }

    @Test
    public void testMultiplicadorElectricoContraAgua() {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(TipoPokemon.ELÉCTRICO, TipoPokemon.AGUA);
        assertEquals(2.0, multiplicador, "Eléctrico debería ser 2x efectivo contra Agua.");
    }

    @Test
    public void testMultiplicadorPlantaContraAgua() {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(TipoPokemon.PLANTA, TipoPokemon.AGUA);
        assertEquals(2.0, multiplicador, "Planta debería ser 2x efectivo contra Agua.");
    }

    @Test
    public void testMultiplicadorElectricoContraElectrico() {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(TipoPokemon.ELÉCTRICO, TipoPokemon.ELÉCTRICO);
        assertEquals(1.0, multiplicador, "Eléctrico debería ser neutro contra Eléctrico.");
    }

    @Test
    public void testMultiplicadorNormalContraRoca() {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(TipoPokemon.NORMAL, TipoPokemon.ROCA);
        assertEquals(0.5, multiplicador, "Normal debería ser 0.5x efectivo contra Roca.");
    }

    @Test
    public void testMultiplicadorNoRelación() {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(TipoPokemon.HIELO, TipoPokemon.VENENO);
        assertEquals(1.0, multiplicador, "Hielo debería ser neutro contra Veneno.");
    }
}
