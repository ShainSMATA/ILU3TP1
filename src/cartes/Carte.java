package cartes;

public abstract class Carte {
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			return obj.getClass()== this.getClass();
			//this instance de class
		}
		return false;
	}
	
	

}
