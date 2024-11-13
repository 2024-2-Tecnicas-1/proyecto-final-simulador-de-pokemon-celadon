package simulador.pokemon;

public abstract class Pokemon {

    String nombre;
    private int salud;
    private int puntosDeAtaque;
    private TipoPokemon tipo;
    private String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo1, TipoPokemon tipo2) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = "saludable";
    }

    public void atacar(Pokemon oponente) {
    double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(this.tipo, oponente.tipo);
    int daño = (int)(this.puntosDeAtaque * multiplicador);
    oponente.recibirDaño(daño);
    System.out.println(this.nombre + " atacó a " + oponente.getNombre() + " causando " + daño + " puntos de daño.");
}


    public void recibirDaño(int daño) {
    this.salud -= daño;
    if (this.salud <= 0) {
        this.salud = 0;
        this.estado = "debilitado";
        System.out.println(this.nombre + " ha sido debilitado.");
    } else {
        System.out.println(this.nombre + " tiene " + this.salud + " puntos de vida restantes.");
    }
}

    public void entrenar() {
        salud = salud + 10;
        puntosDeAtaque = puntosDeAtaque + 7;
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
}