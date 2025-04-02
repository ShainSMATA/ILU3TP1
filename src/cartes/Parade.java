/*
package cartes;

public class Parade extends Bataille {

	public Parade(Type type) {
		super(type);
	}
	
	@Override
	public String toString() {
		return type.getPara();	  
	}


}
*/

package cartes;

public class Parade extends Bataille {

    public Parade(Type type) {
        super(type);
    }

    @Override
    public String toString() {
        return getType().getPara();                            // ✅ Utilisation correcte de `getType()`
    }
}
