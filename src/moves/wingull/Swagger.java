package moves.wingull;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends StatusMove{
	int stick;
	
	public Swagger(double power, double accuracy) {
		super(Type.NORMAL, power, accuracy);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
		
		Effect.confuse(pokemon);
		
		
		if (stick < 6) {
			stick += 2;
		}
		
		pokemon.setMod(Stat.ATTACK, stick);
		
	}
	@Override
	protected String describe() {
		return "ведёт себя развязно";
	}
}
