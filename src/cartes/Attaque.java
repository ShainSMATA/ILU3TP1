package cartes;

public class Attaque extends Bataille {

	public Attaque(Type type) {
		// TODO Auto-generated constructor stub
		super(type);
	}
	
	
	@Override
	public String toString() {
		return type.getAtt();	  
	}

}
