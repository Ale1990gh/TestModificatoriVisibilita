package it.pacchetto.def;

import it.pacchetto.abc.ClasseDiPartenza;

public class TestMainAltroPackageClasseDerivata extends ClasseDiPartenza {
	
	public static void main(String args[]) {

		ClasseDiPartenza c = new ClasseDiPartenza();
		String className = c.getClass().getName();
		System.out.println("La " + c.variabilePublic + " della classe \"" + className + "\" è visibile !");
//		System.out.println("La " + c.variabilePrivate + " della classe \"" + className + "\" è visibile !");//Errore: The field FirstClass.variabilePrivate is not visible
//		System.out.println("La " + c.variabileProtected + " della classe \"" + className + "\" è visibile !");//Errore: The field FirstClass.variabileProtected is not visible
//		System.out.println("La " + c.variabileDefault + " della classe \"" + className + "\" è visibile !");//Errore: The field FirstClass.variabileDefault is not visible

		c.metodoPublic();
//		c.metodoPrivate();//Errore: The method metodoPrivate() from the type ClasseDiPartenza is not visible
//		c.metodoProtected();//Errore: The method metodoProtected() from the type ClasseDiPartenza is not visible
//		c.metodoDefault();//Errore: The method metodoDefault() from the type ClasseDiPartenza is not visible

		TestMainAltroPackageClasseDerivata b = new TestMainAltroPackageClasseDerivata();
		String classNameB = b.getClass().getName();
		System.out.println("\nLa classe \"" + classNameB + "\" estende la classe \"" + className + "\".\n");

		System.out.println("La " + b.variabilePublic + " della classe \"" + classNameB + "\" è visibile !");
//		System.out.println("La " + b.variabilePrivate + " della classe \"" + classNameB + "\" è visibile !");//Errore: The field FirstClass.variabilePrivate is not visible
		System.out.println("La " + b.variabileProtected + " della classe \"" + classNameB + "\" è visibile !");
//		System.out.println("La " + b.variabileDefault + " della classe \"" + classNameB + "\" è visibile !");//Errore: The field FirstClass.variabileDefault is not visible

		b.metodoPublic();
//		b.metodoPrivate();//Errore: The method metodoPrivate() from the type ClasseDiPartenza is not visible
		b.metodoProtected();
//		b.metodoDefault();//Errore: The method metodoDefault() from the type ClasseDiPartenza is not visible

	}

}
