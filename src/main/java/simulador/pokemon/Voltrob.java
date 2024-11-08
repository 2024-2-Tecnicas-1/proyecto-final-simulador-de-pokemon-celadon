
package simulador.pokemon;


public class Voltrob extends Pokemon {
    
    public Voltrob (){
        super("Voltrob", 40, 30, TipoPokemon.Eléctrico);
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
