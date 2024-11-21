package simulador.batalla;

import java.util.Scanner;
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
        
        Scanner lectorBatalla = new Scanner(System.in);
        
        // Verificar que los entrenadores tengan Pokémon asignados
        if (entrenador1 == null || entrenador2 == null) {
            System.out.println("Uno de los entrenadores no ha sido inicializado correctamente.");
            return;
        }

        System.out.println("¡La batalla entre " + entrenador1.getNombre() + " y " + entrenador2.getNombre() + " está a punto de comenzar!");

        // Preparar los Pokémon de cada entrenador
        Pokemon pokemon1 = entrenador1.prepararBatalla();
        Pokemon pokemon2 = entrenador2.prepararBatalla();

        if (pokemon1 == null || pokemon2 == null) {
            System.out.println("La batalla no puede comenzar porque un entrenador no tiene Pokémon disponibles.");
            return;
        }

        System.out.println("¡" + pokemon1.getNombre() + " contra " + pokemon2.getNombre() + "! Que comience la batalla.");

        // Simulación de la batalla por turnos
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {

            // Turno del entrenador1
            System.out.println(entrenador1.getNombre() + ", ¿quieres atacar? (presiona 'S' para atacar o cualquier otra tecla para saltar tu turno)");
            String decision1 = lectorBatalla.nextLine().toUpperCase();
            if (decision1.equals("S")) {
                System.out.println(entrenador1.getNombre() + " ordena a " + pokemon1.getNombre() + " que ataque.");
                pokemon1.atacar(pokemon2);
                if (pokemon2.getSalud() <= 0) {
                    System.out.println(pokemon2.getNombre() + " ha sido derrotado.");
                    break;
                }
            } else {
                System.out.println(entrenador1.getNombre() + " decidió no atacar este turno.");
            }

            // Turno del entrenador2
            System.out.println(entrenador2.getNombre() + ", ¿quieres atacar? (presiona 'S' para atacar o cualquier otra tecla para saltar tu turno)");
            String decision2 = lectorBatalla.nextLine().toUpperCase();
            if (decision2.equals("S")) {
                System.out.println(entrenador2.getNombre() + " ordena a " + pokemon2.getNombre() + " que ataque.");
                pokemon2.atacar(pokemon1);
                if (pokemon1.getSalud() <= 0) {
                    System.out.println(pokemon1.getNombre() + " ha sido derrotado.");
                    break;
                }
            } else {
                System.out.println(entrenador2.getNombre() + " decidió no atacar este turno.");
            }
        }

        // Determinamos el ganador
        if (pokemon1.getSalud() > 0) {
            System.out.println(entrenador1.getNombre() + " gana la batalla con " + pokemon1.getNombre() + ".");
        } else {
            System.out.println(entrenador2.getNombre() + " gana la batalla con " + pokemon2.getNombre() + ".");
        }
    }
}
