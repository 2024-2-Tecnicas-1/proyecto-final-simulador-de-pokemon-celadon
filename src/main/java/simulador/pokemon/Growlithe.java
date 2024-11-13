
package simulador.pokemon;


public class Growlithe extends Pokemon {
    
    public Growlithe (){
        super("Growlithe", 55, 70, TipoPokemon.FUEGO, TipoPokemon.NULL);
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
