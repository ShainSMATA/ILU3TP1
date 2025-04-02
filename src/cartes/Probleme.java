package cartes;

public abstract class Probleme extends Carte {
	private Type type;

	protected Probleme(Type type) {
		// TODO Auto-generated constructor stub
		this.type = type;
		
	}

	public Type getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			Probleme probleme = (Probleme) obj ;
			return this.type== probleme.type;
		}
		return false;
	}

}
