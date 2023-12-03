package pokemons;

import moves.wingull.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wingull extends Pokemon {
	protected Swagger swagger;
	protected SteelWing steelWing;
	protected Scald scald;
	public Wingull(String name, int level) {
		super(name, level);
		
		super.setType(Type.WATER, Type.FLYING);
		super.setStats(40, 30, 30, 55, 30, 85);
		
		swagger = new Swagger(85, 15);
		steelWing = new SteelWing(70, 90);
		scald = new Scald(80, 100);
		
		super.setMove(swagger, steelWing, scald);
	}
}
