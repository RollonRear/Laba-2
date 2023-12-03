package moves.sewaddle;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RazorLeaf extends PhysicalMove{
	public RazorLeaf(double power, double accuracy) {
		super(Type.GRASS, power, accuracy);
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def) {
		double rate = 1/8;
		if(Math.random() < rate) {
			return 2;
		} else {
			return 1;
		}

	}
	@Override
	protected String describe() {
		return "используют бритвалист";
	}
}
