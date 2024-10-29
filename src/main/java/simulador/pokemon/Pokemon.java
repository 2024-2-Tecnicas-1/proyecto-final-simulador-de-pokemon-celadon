package simulador.pokemon;

public class Pokemon {

    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private int tipo;
    private String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, String estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.estado = estado;
    }

    public int recibirDaño() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque ) {
        this.puntosDeAtaque = puntosDeAtaque;
        
    }

    public void entrenar() {
        salud += 5;
        puntosDeAtaque += 3;
        
    }
}