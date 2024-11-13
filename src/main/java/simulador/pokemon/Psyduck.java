
package simulador.pokemon;


public class Psyduck extends Pokemon {
    
    public Psyduck (){
        super("Psyduck", 55, 70, TipoPokemon.AGUA, TipoPokemon.NULL);
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

