package it.pacchetto.def;

import it.pacchetto.abc.ClasseDiPartenza;

public class TestMainAltroPackage {
	
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

		System.out.println("\nTest con variabili e metodi statici\n");

		System.out.println("La " + c.variabilePublicStatica + " della classe \"" + className + "\" è visibile !");//Avviso: The static field ClasseDiPartenza.variabilePublicStatica should be accessed in a static way
//		System.out.println("La " + c.variabilePrivateStatica + " della classe \"" + className + "\" è visibile !");//Errore: The field ClasseDiPartenza.variabilePrivateStatica is not visible
//		System.out.println("La " + c.variabileProtectedStatica + " della classe \"" + className + "\" è visibile !");//Errore: The field ClasseDiPartenza.variabileProtectedStatica is not visible
//		System.out.println("La " + c.variabileDefaultStatica + " della classe \"" + className + "\" è visibile !");//Errore: The field ClasseDiPartenza.variabileDefaultStatica is not visible

		c.metodoPublicStatico();//Avviso: The static method metodoPublicStatico() from the type ClasseDiPartenza should be accessed in a static way
//		c.metodoPrivateStatico();//Errore: The method metodoPrivateStatico() from the type ClasseDiPartenza is not visible
//		c.metodoProtectedStatico();//Errore: The method metodoProtectedStatico() from the type ClasseDiPartenza is not visible
//		c.metodoDefaultStatico();//Errore: The method metodoDefaultStatico() from the type ClasseDiPartenza is not visible

		/*
		TestMainAltroPackage b = new TestMainAltroPackage();
		String classNameB = b.getClass().getName();

		System.out.println("La " + b.variabilePublic + " della classe \"" + classNameB + "\" è visibile !");//Errore: variabilePublic cannot be resolved or is not a field
		System.out.println("La " + b.variabilePrivate + " della classe \"" + classNameB + "\" è visibile !");//Errore: variabilePrivate cannot be resolved or is not a field
		System.out.println("La " + b.variabileProtected + " della classe \"" + classNameB + "\" è visibile !");//Errore: variabileProtected cannot be resolved or is not a field
		System.out.println("La " + b.variabileDefault + " della classe \"" + classNameB + "\" è visibile !");//Errore: variabileDefault cannot be resolved or is not a field

		b.metodoPublic();//Errore: The method metodoPublic() is undefined for the type TestMainAltroPackage
		b.metodoPrivate();//Errore: The method metodoPrivate() is undefined for the type TestMainAltroPackage
		b.metodoProtected();//Errore: The method metodoProtected() is undefined for the type TestMainAltroPackage
		b.metodoDefault();//Errore: The method metodoDefault() is undefined for the type TestMainAltroPackage
		
		System.out.println("\nTest con variabili e metodi statici\n");

		System.out.println("La " + b.variabilePublicStatica + " della classe \"" + className + "\" è visibile !");//Errore: variabilePublicStatica cannot be resolved or is not a field
		System.out.println("La " + b.variabilePrivateStatica + " della classe \"" + className + "\" è visibile !");//Errore: The field ClasseDiPartenza.variabilePrivateStatica is not visible
		System.out.println("La " + b.variabileProtectedStatica + " della classe \"" + className + "\" è visibile !");//Errore: variabileProtectedStatica cannot be resolved or is not a field
		System.out.println("La " + b.variabileDefaultStatica + " della classe \"" + className + "\" è visibile !");//Errore: variabileDefaultStatica cannot be resolved or is not a field

		b.metodoPublicStatico();//Errore: The method metodoPublicStatico() is undefined for the type TestMainStessoPackage
		b.metodoPrivateStatico();//Errore: The method metodoPrivateStatico() is undefined for the type TestMainStessoPackage
		b.metodoProtectedStatico();//Errore: The method metodoProtectedStatico() is undefined for the type TestMainStessoPackage
		b.metodoDefaultStatico();//Errore: The method metodoDefaultStatico() is undefined for the type TestMainStessoPackage
		 */

	}

}
