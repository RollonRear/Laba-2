package pokemons;

import moves.sewaddle.*;

public class Swadloon extends Sewaddle{
	protected GrassWhistle grassWhistle;
	public Swadloon(String name, int level) {
		super(name, level);
		super.setStats(55, 63, 90, 50, 80, 42);
		
		grassWhistle = new GrassWhistle(0, 55);
		
		super.setMove(rest, doubleTeam, grassWhistle);
	}
}
