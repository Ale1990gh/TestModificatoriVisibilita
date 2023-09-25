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
		 */
	}

}
