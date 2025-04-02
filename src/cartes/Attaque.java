/*
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
*/

package cartes;

public class Attaque extends Bataille {

    public Attaque(Type type) {
        super(type);
    }

    @Override
    public String toString() {
        return getType().getAtt();  // ✅ Utilisation correcte de `getType()`
    }
}
