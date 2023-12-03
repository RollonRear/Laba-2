package lava2;


import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class App {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pelipper pelipper = new Pelipper("Pelipper", 1);
		Regigigas regigigas = new Regigigas("Regigigas", 1);
		Leavanny leavanny = new Leavanny("Leavanny", 1);
		Sewaddle sewaddle = new Sewaddle("Sewaddle", 1);
		Swadloon swadloon = new Swadloon("Swadloon", 1);
		Wingull wingull = new Wingull("Wingull", 1);
		
		
		b.addAlly(pelipper);
		b.addFoe(regigigas);
		b.addAlly(leavanny);
		b.addFoe(sewaddle);
		b.addAlly(swadloon);
		b.addFoe(wingull);
		b.go();
	}
	
}
