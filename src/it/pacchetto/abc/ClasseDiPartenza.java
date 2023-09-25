package it.pacchetto.abc;

public class ClasseDiPartenza {

	public String variabilePublic = "variabile public";
	private String variabilePrivate = "variabile private";
	protected String variabileProtected = "variabile protected";
	String variabileDefault = "variabile default";//IDE: "package"

	public static String variabilePublicStatica = "variabile public statica";
	private static String variabilePrivateStatica = "variabile private statica";
	protected static String variabileProtectedStatica = "variabile protected statica";
	static String variabileDefaultStatica = "variabile default statica";//IDE: "package"

	
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

	public static String getVariabilePublicStatica() {
		return variabilePublicStatica;
	}

	public static String getVariabilePrivateStatica() {
		return variabilePrivateStatica;
	}

	public static String getVariabileProtectedStatica() {
		return variabileProtectedStatica;
	}

	public static String getVariabileDefaultStatica() {
		return variabileDefaultStatica;
	}
	 */

	public static void main(String args[]) {

		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();

		System.out.println("La " + c.variabilePublic + " della classe \"" + className + "\" è visibile !");
		System.out.println("La " + c.variabilePrivate + " della classe \"" + className + "\" è visibile !");
		System.out.println("La " + c.variabileProtected + " della classe \"" + className + "\" è visibile !");
		System.out.println("La " + c.variabileDefault + " della classe \"" + className + "\" è visibile !");

		/*
		metodoPublic();//Errore: Cannot make a static reference to the non-static method metodoPublic() from the type ClasseDiPartenza
		metodoPrivate();//Errore: Cannot make a static reference to the non-static method metodoPublic() from the type ClasseDiPartenza
		metodoProtected();//Errore: Cannot make a static reference to the non-static method metodoPublic() from the type ClasseDiPartenza
		metodoDefault();//Errore: Cannot make a static reference to the non-static method metodoPublic() from the type ClasseDiPartenza
		 */

		System.out.println("\nTest con variabili e metodi statici\n");
		
		System.out.println("La " + c.variabilePublicStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabilePublicStatica should be accessed in a static way
		System.out.println("La " + c.variabilePrivateStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabilePublicStatica should be accessed in a static way
		System.out.println("La " + c.variabileProtectedStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabilePublicStatica should be accessed in a static way
		System.out.println("La " + c.variabileDefaultStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabilePublicStatica should be accessed in a static way

		metodoPublicStatico();
		metodoPrivateStatico();
		metodoProtectedStatico();
		metodoDefaultStatico();
		
	}

	public void metodoPublic() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Il metodo \""+ methodName +"\" della classe \"" + className + "\" è visibile !");
	}

	@SuppressWarnings("unused")//Avviso: The method metodoPrivate() from the type ClasseDiPartenza is never used locally
	private void metodoPrivate() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Il metodo \""+ methodName +"\" della classe \"" + className + "\" è visibile !");
	}
	
	protected void metodoProtected() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Il metodo \""+ methodName +"\" della classe \"" + className + "\" è visibile !");
	}
	
	void metodoDefault() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Il metodo \""+ methodName +"\" della classe \"" + className + "\" è visibile !");
	}

	public static void metodoPublicStatico() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Il metodo \""+ methodName +"\" della classe \"" + className + "\" è visibile !");
	}

	@SuppressWarnings("unused")//Avviso: The method metodoPrivate() from the type ClasseDiPartenza is never used locally
	private static void metodoPrivateStatico() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Il metodo \""+ methodName +"\" della classe \"" + className + "\" è visibile !");
	}
	
	protected static void metodoProtectedStatico() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Il metodo \""+ methodName +"\" della classe \"" + className + "\" è visibile !");
	}
	
	 static void metodoDefaultStatico() {
		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Il metodo \""+ methodName +"\" della classe \"" + className + "\" è visibile !");
	}

}
