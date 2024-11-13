package simulador.pokemon;

public enum TipoPokemon{
    NORMAL, FUEGO, AGUA, ELÉCTRICO, PLANTA, HIELO, VENENO, VOLADOR, LUCHA, PSIQUICO, TIERRA, ROCA;


    private static final double[][] multiplicadores = {
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, // NORMAL
        {1.0, 1.0, 0.5, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5}, // FUEGO
        {1.0, 2.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0}, // AGUA
        {1.0, 1.0, 2.0, 1.0, 0.0, 1.0, 1.0, 2.0, 1.0, 1.0, 0.0, 1.0}, // ELECTRICO
        {1.0, 0.5, 2.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 2.0, 2.0}, // PLANTA
        {1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0},  // HIELO
        {1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5},  // VENENO
        {1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5},  // VOLADOR
        {2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 1.0, 2.0},  // LUCHA
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0},  // PSIQUICO
        {1.0, 2.0, 1.0, 0.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 2.0},  // TIERRA
        {1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0},  // ROCA
    };
    
    public static double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor) {
        return multiplicadores[atacante.ordinal()][defensor.ordinal()];
    } 
}
//Se usa el método ordinal() para obtener los índices de los tipos de Pokémon (esto devuelve un número entero que corresponde a la posición del tipo en la enumeración).
//Con esos índices, podemos acceder a la matriz multiplicadores para obtener el multiplicador de daño.