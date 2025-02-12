package cartes;

public class Botte extends Probleme {

	public Botte(Type type) {
		// TODO Auto-generated constructor stub
		super(type);
	}
	
	@Override
	public String toString() {
		return getType().getBot();	  
	}


}
