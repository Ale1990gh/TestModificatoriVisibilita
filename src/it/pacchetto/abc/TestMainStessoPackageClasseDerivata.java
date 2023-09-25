package it.pacchetto.abc;

public class TestMainStessoPackageClasseDerivata extends ClasseDiPartenza {
	
	public static void main(String args[]) {

		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		System.out.println("La " + c.variabilePublic + " della classe \"" + className + "\" � visibile !");
//		System.out.println("La " + c.variabilePrivate + " della classe \"" + className + "\" � visibile !");//Errore: The field FirstClass.variabilePrivate is not visible
		System.out.println("La " + c.variabileProtected + " della classe \"" + className + "\" � visibile !");
		System.out.println("La " + c.variabileDefault + " della classe \"" + className + "\" � visibile !");
		
		c.metodoPublic();
//		c.metodoPrivate();//Errore: The method metodoPrivate() from the type ClasseDiPartenza is not visible
		c.metodoProtected();
		c.metodoDefault();

		TestMainStessoPackageClasseDerivata b = new TestMainStessoPackageClasseDerivata();
		String classNameB = b.getClass().getName();
		System.out.println("\nLa classe \"" + classNameB + "\" estende la classe \"" + className + "\".\n");

		System.out.println("La " + b.variabilePublic + " della classe \"" + classNameB + "\" � visibile !");
//		System.out.println("La " + b.variabilePrivate + " della classe \"" + classNameB + "\" � visibile !");//Errore: The field FirstClass.variabilePrivate is not visible
		System.out.println("La " + b.variabileProtected + " della classe \"" + classNameB + "\" � visibile !");
		System.out.println("La " + b.variabileDefault + " della classe \"" + classNameB + "\" � visibile !");

		b.metodoPublic();
//		b.metodoPrivate();//Errore: The method metodoPrivate() from the type ClasseDiPartenza is not visible
		b.metodoProtected();
		b.metodoDefault();

	}

}
