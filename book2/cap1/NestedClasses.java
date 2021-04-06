/*
 *-A nested class is a class that is defined within another class
 *-A nested class can come in one of four flavors
 	1- inner class: clases no estaticas definidas al mismo nivel de miembros : { methods, constructor, fields }
 	2- static nested class: clases estaticas definidas al mismo nivel de miembros : { methods, constructor, fields }
 	3- local class: clases definidas dentro del cuerpo de un metodo 
 	4- anonymous class: caso especial de una clase local que no tiene nombre

 * */
final public class NestedClasses extends OtherClass{
	/**
	 *1 inner class
	  sol
	 * */
	//inner class es valido que tenga modificador final
	final class X  extends YX{
		//es valido declarar en un inner class variables static final
		static final int valueInt=21;
		
		//no es valido declarar miembros estaticos deben ser final tambien
		//static String name= "myBadName";
		
		//un inner class puede tener un campo con el mismo nombre que su Outer
		int igualNombreQueOuter=21;
		
		//un metodo statico no es permitido dentro de un inner class ni aunque sea final
		//final static void myMetodoStatico(){}
		
		//una variable static por si sola no es aceptada por el compilador dentro de un inner class
		//static int variableStatica;

		//una variable static final si es aceptada por el compilador
		//sin embargo acepta que la asignacion sea realizada en la declaracion
		final static int variableStatica=21;
	
		/* lo siguiente obviamente no es valido porque un static no puede ser inicializado en un constructor
		
		   final static int v_constructor;
			X(){
			v_constructor=21;
			}
		*/

		     X(){
				System.out.println("inner class X constructor");
			}
		// no permite realizar la asignacion usando bloque staticos
		//static {variableStatica=21;}
	}
	//un inner class simple 
	class YX {}
	

	int igualNombreQueOuter;

	//una inner class no puede heredar a otra inner class externo - ninguna de las 2 formas siguientes es valida
	//los inner class necesitan de una instancia de la clase que los envuelve [outer class ] para que puedan ser instanciadas
	//class YX extends OtherClass.OtherX{}
	//class YX extends otherClass.new OtherX{}
	

	//un simple miembro de clase del tipo OtherClass
	static OtherClass otherClass=new OtherClass();

	//abstract final class AFX {}//inner class no es valido que tenga modificador final y abstract
	

	abstract class AX extends StaticClass {}//inner class es valido que tenga modificador abstract


	public static void main (String X []){

		//como crear una instancia de un inner class
		var a = new NestedClasses();
		var ai= a.new YX();

		System.out.println("inner class YX instancia creada: "+ ai);
	
		var innerClassX= a.new X();

		System.out.println("inner class X instancia creada: "+ innerClassX);

		var otherClassHeredado= a.new OtherX();
		System.out.println("inner class OtherX heredado, instancia creada: "+ otherClassHeredado);


		//como crear una instancia de un static class
		var staticFinalClass = new StaticFinalClass();
		System.out.println("static final class StaticFinalClass, instancia creada: "+  staticFinalClass);

	}

	/**
	 *2 static nested class
	 * */
	static protected final class StaticFinalClass{
		int basicInstanceVariable;
		static int basicStaticVariable;
		static final int basicFinalStaticVariable;
		static{basicFinalStaticVariable=21;}
		{basicStaticVariable=21;}
		static void methodStatic(){}
		void methodNoStatic(){}
	}

	static protected class StaticClass{
		int basicInstanceVariable;
		static int basicStaticVariable;
		static final int basicFinalStaticVariable;
		static{basicFinalStaticVariable=21;}
		{basicStaticVariable=21;}
		static void methodStatic(){}
		void methodNoStatic(){}
	}
	
	// una inner class puede heredar de una static nested class
	class foo extends OtherStaticX{}

	//una static nested class puede heredar de una static nested class
	static class fooStatic extends OtherStaticX{}
	
	/**
	 *3 - local class
	 una clase local es declarada dentro de un metodo
	 * */
	void methodlocal(){
		//no permiten modificadores de acceso
		//no pueden ser declarados static
		class demoLocal implements basicInterface{

			static final String fooLocal="PERMITIDO_ASIGNACION_EN_DECLARACION";
			//static {fooLocal="NO_PERMITIDO";} //no se permiten bloques staticos
			
			// es valido
			public final int getValueFinal(){return 21;}
			
			public int getValue(){return 21;}
		}

		//una clase anonima usando var
		var m =  new basicInterface(){  public int getValue(){return 21;}};

		final var finalAnon =  new basicInterface(){
			public int getValue(){return 21; }
			static final int otherValue=22;
		};

		var demoLocalAnonm= new demoLocal(){
			
			public int getValue(){return 22;}
		};

		//esto no es permitido
		//static class localStaticClass{}
	}
	
	static void metodoStaticFoo(){
		// static class localClass{} //NO PERMITIDO EL USO DE static con un local class
	
	}

	//una clase anonima declarada como variable de instancia
	public	basicInterface	basicAnonymous = new  basicInterface(){  public int getValue(){return 21;}};


	//una clase anonima declarada como constante: {public static final}
	public static final	basicInterface	basicAnonymousConstante = new  basicInterface(){  public int getValue(){return 21;}};
	
	//una clase anonima declarada como static 
	public static basicInterface basicAnonymousStatic = new  basicInterface(){  public int getValue(){return 21;}};
}

interface basicInterface{
	int getValue();
}

class OtherClass{

	protected class OtherX{}
	protected static class OtherStaticX{}

}
