
package simulador.pokemon;


public class Voltorb extends Pokemon {
    
    public Voltorb (){
        super("Voltorb", 40, 30, TipoPokemon.ELÉCTRICO);
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
