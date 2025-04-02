package cartes;
/*
public abstract class Bataille extends Probleme {
	protected Type type;

	public Bataille(Type type) {
		// TODO Auto-generated constructor stub
		super(type);
	}

	public Type getType() {
		return type;
	}
}
*/


public abstract class Bataille extends Probleme {


    public Bataille(Type type) {
        super(type);  // ✅ Maintenant, `type` est bien initialisé via `Probleme`
    }

    public Type getType() {
        return super.getType();  // ✅ On récupère le `type` correctement initialisé
    }
}
