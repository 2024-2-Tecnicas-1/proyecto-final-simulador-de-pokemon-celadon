package simulador.pokemon;

public enum TipoPokemon{
    Normal, Fuego, Agua, Eléctrico, Planta, Hielo;


    private static final double[][] multiplicadores = {
        {1.0, 1.0, 1.0, 1.0, 1.0, 1.0}, // NORMAL
        {1.0, 1.0, 0.5, 1.0, 2.0, 2.0}, // FUEGO
        {1.0, 2.0, 1.0, 1.0, 0.5, 1.0}, // AGUA
        {1.0, 1.0, 2.0, 1.0, 0.0, 1.0}, // ELECTRICO
        {1.0, 0.5, 2.0, 1.0, 1.0, 2.0}, // PLANTA
        {1.0, 0.5, 2.0, 1.0, 0.5, 1.0}  // HIELO
    };
    
    public static double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor) {
        return multiplicadores[atacante.ordinal()][defensor.ordinal()];
    } 
}
//Se usa el método ordinal() para obtener los índices de los tipos de Pokémon (esto devuelve un número entero que corresponde a la posición del tipo en la enumeración).
//Con esos índices, podemos acceder a la matriz multiplicadores para obtener el multiplicador de daño.