package pokemons;

import moves.regigigasmoves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Regigigas extends Pokemon{
	public Regigigas(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(110, 160, 110, 80, 110, 100);
		
		ZenHeadbutt zenHeadbutt = new ZenHeadbutt(80, 90);
		ThunderPunch thunderPunch = new ThunderPunch(75, 100);
		RockPolish rockPolish = new RockPolish(0, 0);
		StoneEdge stoneEdge = new StoneEdge(100, 80);
		
		super.setMove(zenHeadbutt, thunderPunch, rockPolish, stoneEdge);
	}
}
