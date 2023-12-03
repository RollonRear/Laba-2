package moves.wingull;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SteelWing extends PhysicalMove{
	int stick;
	public SteelWing(double power, double accuracy) {
		super(Type.STEEL, power, accuracy);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
		
		if (0.1 > Math.random()) {
			
			if (stick < 6) {
				stick += 2;
			}
			
			pokemon.setMod(Stat.DEFENSE, stick);
		}
		
	}
	@Override
	protected String describe() {
		return "бьёт стальным крылом";
	}
}
