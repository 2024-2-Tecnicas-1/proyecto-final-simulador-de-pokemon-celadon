
package simulador.pokemon;


public class Zubat extends Pokemon {
    
    public Zubat (){
        super("Zubat", 40, 45, TipoPokemon.Normal);
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
