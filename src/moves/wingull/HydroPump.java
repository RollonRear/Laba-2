package moves.wingull;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
	public HydroPump(double power, double accuracy) {
		super(Type.WATER, power, accuracy);
	}
	@Override
	protected String describe() {
		return "ударил гидронасосом";
	}
}
