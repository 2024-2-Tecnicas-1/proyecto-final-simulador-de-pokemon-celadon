package simulador.entrenador;
import java.util.ArrayList;
import java.util.List;

import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

import java.util.List;
import java.util.Scanner;

public class Entrenador {
    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre) {
    this.nombre = nombre;
    this.pokemones = new ArrayList<>();
}

    
    
    public void agregarPokemon(Pokemon pokemon) {
        pokemones.add(pokemon);
    }

   
    public void entrenarPokemon(Pokemon pokemon) {
        if (pokemones.contains(pokemon)) {
            pokemon.entrenar();
            System.out.println(pokemon.getNombre() + " ahora tiene " + pokemon.getPuntosDeAtaque() + " de daño y "  + pokemon.getSalud() +"de vida");
        } else {
            System.out.println("El Pokémon no está en el equipo.");
        }
    }
     
     public void mostrarPokemones() {
    System.out.println(nombre + " tiene los siguientes Pokémones:");
    int n = 1;
    for (Pokemon pokemon : pokemones) {
        System.out.println(n + ". " + pokemon.getNombre() + " (Salud: " + pokemon.getSalud() + ")");
        n++;
    }
}
    public Pokemon elegirPokemon() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Elige un Pokémon de tu equipo:");
    mostrarPokemones();
    System.out.print("Introduce el número del Pokémon que deseas elegir: ");
    int seleccion = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer de la entrada

    if (seleccion < 1 || seleccion > pokemones.size()) {
        System.out.println("Selección inválida.");
        return null;
    }
    return pokemones.get(seleccion - 1);
}
    
    private int entrenamientos = 0;  

    
    public int getEntrenamientos() {
        return entrenamientos;
    }

    public void incrementarEntrenamientos() {
        entrenamientos++;
    }
    
    public Pokemon prepararBatalla() {
        if (pokemones.isEmpty()) {
            System.out.println("No tienes Pokémones en tu equipo para la batalla.");
            return null;
        }
        
        Scanner scanner = new Scanner(System.in);
        mostrarPokemones();
        
        System.out.print("Elige el número del Pokémon para la batalla: ");
        int seleccion = scanner.nextInt();

        
        if (seleccion < 1 || seleccion > pokemones.size()) {
            System.out.println("Selección inválida. Por favor, elige un número de la lista.");
            return null;
        }

        
        Pokemon pokemonSeleccionado = pokemones.get(seleccion - 1);
        System.out.println("El Pokémon seleccionado para la batalla es: " + pokemonSeleccionado.getNombre());
        return pokemonSeleccionado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

   
}
    
