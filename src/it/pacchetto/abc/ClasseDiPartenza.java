package it.pacchetto.abc;

public class ClasseDiPartenza {

	public String variabilePublic = "variabile public";
	
	private String variabilePrivate = "variabile private";
	
	protected String variabileProtected = "variabile protected";
	
	String variabileDefault = "variabile default";//IDE: "package"
	
//	private ClasseDiPartenza () {}//Con costruttore private non si possono creare altre istanze delle variabili in altre classi !
	
	/*
	public String getVariabilePublic() {
		return variabilePublic;
	}

	public String getVariabilePrivate() {
		return variabilePrivate;
	}

	public String getVariabileProtected() {
		return variabileProtected;
	}

	public String getVariabileDefault() {
		return variabileDefault;
	}
	 */

	public static void main(String args[]) {

		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();

		System.out.println("La " + c.variabilePublic + " della classe \"" + className + "\" è visibile !");
		System.out.println("La " + c.variabilePrivate + " della classe \"" + className + "\" è visibile !");
		System.out.println("La " + c.variabileProtected + " della classe \"" + className + "\" è visibile !");
		System.out.println("La " + c.variabileDefault + " della classe \"" + className + "\" è visibile !");

//		metodoPublic();
//		metodoPrivate();
//		metodoProtected();
//		metodoDefault();

	}
	
	public void metodoPublic() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		System.out.println("Il metodo \"metodoPublic\" della classe \"" + className + "\" è visibile !");
	}

	@SuppressWarnings("unused")//Warning: The method metodoPrivate() from the type ClasseDiPartenza is never used locally
	private void metodoPrivate() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		System.out.println("Il metodo \"metodoPrivate\" della classe \"" + className + "\" è visibile !");
	}
	
	protected void metodoProtected() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		System.out.println("Il metodo \"metodoProtected\" della classe \"" + className + "\" è visibile !");
	}
	
	void metodoDefault() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		System.out.println("Il metodo \"metodoDefault\" della classe \"" + className + "\" è visibile !");
	}

}
