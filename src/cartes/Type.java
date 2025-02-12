package cartes;

public enum Type {
	FEU("feu rouge", "feu vert", "vehicule prioritaire"),
	ESSENCE("panne d'essence ", "essence", "citerne d'essence"),
	CREVAISON("crevaison", "roue de secoure", "increvable"),
	ACCIDENT("accident", "reparation", "as du volant");
	
	
	
	private String att;
	private String para;
	private String bot;

	private Type (String att,String para,String bot) {
		this.att = att;
		this.para = para;
		this.bot =bot;
		
	}

	public String getAtt() {
		return att;
	}



	public String getPara() {
		return para;
	}



	public String getBot() {
		return bot;
	}

	

	

}
