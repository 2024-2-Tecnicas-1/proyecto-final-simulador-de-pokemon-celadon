
package simulador.pokemon;


public class Exeggcute extends Pokemon {
    
    public Exeggcute (){
        super("Exeggcute", 60, 40, TipoPokemon.Planta);
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
