package moves.wingull;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Scald extends SpecialMove {
	int stick;
	public Scald(double power, double accuracy) {
		super(Type.WATER, power, accuracy);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		
		if (0.3 > Math.random()) {
			
			Effect.burn(pokemon);
		}
		
	}
	@Override
	protected String describe() {
		return "подпалил своего врага";
	}
}
