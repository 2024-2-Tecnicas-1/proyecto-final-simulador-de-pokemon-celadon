
package simulador.pokemon;


public class Onix extends Pokemon {
    
    public Onix (){
        super("Onix", 35, 45, TipoPokemon.ROCA, TipoPokemon.TIERRA);
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
