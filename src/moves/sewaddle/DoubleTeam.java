package moves.sewaddle;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove{
	private int stick = 0;
	public DoubleTeam(double power, double accuracy) {
		super(Type.NORMAL, power, accuracy);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
		
		if (stick < 6) {
			stick += 1;
		}
		
		pokemon.setMod(Stat.EVASION, stick);
		
	}
	@Override
	protected String describe() {
		return "использует двойную комманду";
	}

}