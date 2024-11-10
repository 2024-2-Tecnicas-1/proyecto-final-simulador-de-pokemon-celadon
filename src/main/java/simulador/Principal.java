import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import simulador.entrenador.Entrenador;
import simulador.pokemon.*;
import simulador.batalla.Batalla;

public class Principal {
     private static Scanner scanner = new Scanner(System.in);
    private static List<Entrenador> entrenadores = new ArrayList<>();
    private static List<Pokemon> pokemonesRegistrados = new ArrayList<>();
    
    public static void main(String[] args) {

        pokemonesRegistrados.add(new Bellsprout());
        pokemonesRegistrados.add(new Exeggcute());
        pokemonesRegistrados.add(new Farfetch_d());
        pokemonesRegistrados.add(new Growlithe());
        pokemonesRegistrados.add(new Onix());
        pokemonesRegistrados.add(new Psyduck());
        pokemonesRegistrados.add(new Tentacool());
        pokemonesRegistrados.add(new Voltorb());
        pokemonesRegistrados.add(new Zubat());
        
        int opcion;
        do {
            System.out.println("Simulador de Batallas Pokemon");
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokemones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            } while (opcion != 4);
    }
}
