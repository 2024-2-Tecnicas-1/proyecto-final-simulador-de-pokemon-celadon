package simulador.batalla;

import simulador.entrenador.Entrenador;
import simulador.pokemon.Pokemon;

public class Batalla {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void iniciarBatalla() {
        System.out.println("¡La batalla entre " + entrenador1.getNombre() + " y " + entrenador2.getNombre() + " está a punto de comenzar!");
        
        
        Pokemon pokemon1 = entrenador1.prepararBatalla();
        Pokemon pokemon2 = entrenador2.prepararBatalla();
        
        if (pokemon1 == null || pokemon2 == null) {
            System.out.println("La batalla no puede comenzar porque un entrenador no tiene Pokémon disponibles.");
            return;
        }
        
        System.out.println("¡" + pokemon1.getNombre() + " contra " + pokemon2.getNombre() + "! Que comience la batalla.");

        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            
            System.out.println(entrenador1.getNombre() + " ordena a " + pokemon1.getNombre() + " que ataque.");
            pokemon1.atacar(pokemon2);
            if (pokemon2.getSalud() <= 0) {
                System.out.println(pokemon2.getNombre() + " ha sido derrotado.");
                break;
            }

            
            System.out.println(entrenador2.getNombre() + " ordena a " + pokemon2.getNombre() + " que ataque.");
            pokemon2.atacar(pokemon1);
            if (pokemon1.getSalud() <= 0) {
                System.out.println(pokemon1.getNombre() + " ha sido derrotado.");
                break;
            }
        }

        if (pokemon1.getSalud() > 0) {
            System.out.println(entrenador1.getNombre() + " gana la batalla con " + pokemon1.getNombre() + ".");
        } else {
            System.out.println(entrenador2.getNombre() + " gana la batalla con " + pokemon2.getNombre() + ".");
        }
    }
}
