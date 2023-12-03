package moves.regigigasmoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ZenHeadbutt extends PhysicalMove{
	public ZenHeadbutt(double power, double accuracy) {
		super(Type.PSYCHIC, power, accuracy);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		
		if (0.2 > Math.random()) {
			Effect.flinch(pokemon);
		}
		
	}
	@Override
	protected String describe() {
		return "используют дзен удар головой";
	}
}
