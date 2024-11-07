package simulador.pokemon;

public abstract class Pokemon {

    String nombre;
    private int salud;
    private int puntosDeAtaque;
    private TipoPokemon tipo;
    private String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = "saludable";
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }


    public String getEstado() {
        return estado;
    }

    public void atacar(Pokemon oponente) {
    }

    public void recibirDaño(int daño) {
    }

    public void entrenar() {
    }
}