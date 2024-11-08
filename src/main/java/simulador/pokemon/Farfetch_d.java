
package simulador.pokemon;


public class Farfetch_d extends Pokemon {
    
    public Farfetch_d (){
        super("Farfetch_d", 52, 90, TipoPokemon.Normal);
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
