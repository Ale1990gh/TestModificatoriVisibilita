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

		System.out.println("\nTest con variabili e metodi statici !!!\n");

		System.out.println("La " + c.variabilePublicStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabilePublicStatica should be accessed in a static way
//		System.out.println("La " + c.variabilePrivateStatica + " della classe \"" + className + "\" è visibile !");//Errore: The field ClasseDiPartenza.variabilePrivateStatica is not visible
		System.out.println("La " + c.variabileProtectedStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabilePublicStatica should be accessed in a static way
//		System.out.println("La " + c.variabileDefaultStatica + " della classe \"" + className + "\" è visibile !");//Errore: The field ClasseDiPartenza.variabileDefaultStatica is not visible

		c.metodoPublicStatico();//Avviso: The static method metodoPublicStatico() from the type ClasseDiPartenza should be accessed in a static way
//		c.metodoPrivateStatico();//Errore: The method metodoPrivateStatico() from the type ClasseDiPartenza is not visible
		c.metodoProtectedStatico();//Avviso: The static method metodoProtectedStatico() from the type ClasseDiPartenza should be accessed in a static way
//		c.metodoDefaultStatico();//Errore: The method metodoDefaultStatico() from the type ClasseDiPartenza is not visible

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
		
		System.out.println("\nTest con variabili e metodi statici\n");

		System.out.println("La " + b.variabilePublicStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabilePublicStatica should be accessed in a static way
//		System.out.println("La " + b.variabilePrivateStatica + " della classe \"" + className + "\" è visibile !");//Errore: The field ClasseDiPartenza.variabilePrivateStatica is not visible
		System.out.println("La " + b.variabileProtectedStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabileProtectedStatica should be accessed in a static way
//		System.out.println("La " + b.variabileDefaultStatica + " della classe \"" + className + "\" è visibile !");//Errore: variabileDefaultStatica cannot be resolved or is not a field

		b.metodoPublicStatico();//Avviso: The static method metodoPublicStatico() from the type ClasseDiPartenza should be accessed in a static way
//		b.metodoPrivateStatico();//Errore: The method metodoPrivateStatico() is undefined for the type TestMainStessoPackage
		b.metodoProtectedStatico();//Avviso: The static method metodoProtectedStatico() from the type ClasseDiPartenza should be accessed in a static way
//		b.metodoDefaultStatico();//Errore: The method metodoDefaultStatico() is undefined for the type TestMainStessoPackage

	}

}
