package moves.regigigasmoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
	public StoneEdge(double power, double accuracy) {
		super(Type.ROCK, power, accuracy);
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
		return "используют каменное острие";
	}
}
