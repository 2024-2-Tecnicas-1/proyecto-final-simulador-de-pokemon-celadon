
package simulador.pokemon;


public class Tentacool extends Pokemon {
    
    public Tentacool (){
        super("Tentacool", 40, 40, TipoPokemon.AGUA);
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
