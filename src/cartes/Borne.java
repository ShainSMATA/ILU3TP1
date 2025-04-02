package cartes;

public class Borne extends Carte {
	private int km;

	public Borne( int km) {
		// TODO Auto-generated constructor stub
		this.km = km;
	}
	
	@Override
    public String toString() {
        return km + "KM";  
    }
	
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			Borne borne = (Borne) obj ;
			return this.km== borne.km;
		}
		return false;
	}
	
	
	

}
