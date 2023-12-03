package moves.regigigasmoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class ThunderPunch extends PhysicalMove{
	public ThunderPunch(double power, double accuracy) {
		super(Type.ELECTRIC, power, accuracy);
	}
	
	@Override
	protected void applyOppEffects(Pokemon pokemon) {
		super.applyOppEffects(pokemon);
		
		if (0.1 > Math.random()) {
			Effect.paralyze(pokemon);
		}
		
	}
	@Override
	protected String describe() {
		return "используют удар грома";
	}
}