
package simulador.pokemon;


public class Bellsprout extends Pokemon {
    
    public Bellsprout (){
        super("Bellsprout", 50, 75, TipoPokemon.PLANTA, TipoPokemon.VENENO);

    }
    
    @Override
    public void atacar(Pokemon oponente){
         System.out.println(this.getNombre() + " ataca");
        super.atacar(oponente);
    }
    
    @Override
    public void entrenar() {
        System.out.println(this.getNombre() + " se ha entrenado con fuerza.");
        super.entrenar();
    }
}
