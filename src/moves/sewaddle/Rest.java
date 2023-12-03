package moves.sewaddle;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove{
	

	public Rest(double power, double accuracy) {
		super(Type.PSYCHIC, power, accuracy);
	}
	
	@Override
	protected void applySelfEffects(Pokemon pokemon) {
		super.applySelfEffects(pokemon);
		
		pokemon.restore();
		
		Effect e = new Effect().turns(2).condition(Status.SLEEP);
		pokemon.addEffect(e);
		
	}
	
	@Override
	protected String describe() {
		return "отдыхает";
	}

}
