package moves.regigigasmoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class RockPolish extends StatusMove{
	private int stick = 0;
	
	public RockPolish(double power, double accuracy) {
		super(Type.ROCK, power, accuracy);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
		
		if (stick < 6) {
			stick += 2;
		}
		
		pokemon.setMod(Stat.SPEED, stick);
		
	}
	@Override
	protected String describe() {
		return "используют польский рок";
	}
}
