package pokemons;

import moves.sewaddle.*;

public class Leavanny extends Swadloon{
	protected RazorLeaf razorLeaf;
	public Leavanny(String name, int level) {
		super(name, level);
		super.setStats(55, 63, 90, 50, 80, 42);
		
		razorLeaf = new RazorLeaf(55, 95);
		
		super.setMove(rest, doubleTeam, grassWhistle, razorLeaf );
	}
}
