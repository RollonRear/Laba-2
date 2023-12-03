package moves.sewaddle;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class GrassWhistle extends StatusMove {
	public GrassWhistle(double power, double accuracy) {
		super(Type.GRASS, power, accuracy);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		
		Effect.sleep(pokemon);
		
	}
	@Override
	protected String describe() {
		return "использует травяной цветок";
	}

}
