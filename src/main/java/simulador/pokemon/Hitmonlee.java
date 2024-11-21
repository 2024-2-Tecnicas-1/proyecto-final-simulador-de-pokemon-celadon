
package simulador.pokemon;


public class Hitmonlee extends Pokemon {
    
    public Hitmonlee (){
        super("Hitmonlee", 50, 120, TipoPokemon.LUCHA);
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
