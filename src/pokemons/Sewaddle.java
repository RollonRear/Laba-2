package pokemons;

import moves.sewaddle.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sewaddle extends Pokemon {
	protected Rest rest;
	protected DoubleTeam doubleTeam;

	public Sewaddle(String name, int level) {
		super(name, level);
		
		super.setType(Type.BUG, Type.GRASS);
		super.setStats(45, 53, 70, 40, 60, 42);
		
		rest = new Rest(0, 0);
		doubleTeam = new DoubleTeam(0, 0);
		
		super.setMove(rest, doubleTeam);
	}
}
