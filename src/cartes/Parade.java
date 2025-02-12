package cartes;

public class Parade extends Bataille {

	public Parade(Type type) {
		// TODO Auto-generated constructor stub
		super(type);
	}
	
	@Override
	public String toString() {
		return type.getPara();	  
	}


}
