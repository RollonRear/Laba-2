package pokemons;

import moves.wingull.*;

public class Pelipper extends Wingull {

	public Pelipper(String name, int level) {
		super(name, level);

		super.setStats(60, 50, 100, 95, 70, 65);
		
		HydroPump hydroPump = new HydroPump(110, 80);
		
		super.setMove(swagger, steelWing, scald, hydroPump);
	}

}
