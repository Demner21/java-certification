import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Random;


final class GenericsCollectionsDemo{

	/**
	 * a method reference and a lambda behave the same way at runtime
	 * there are four formats for methos references
	 *
	 * -static methods
	 * -instance methods on a particular instance
	 * -instance methods on a parameter to be determined at runtime
	 * -constructors
	 * */
	

	public static void main (String ...z){
		System.out.println("Hello there");
		LearnToTalk learner = System.out::println;
		GenericsCollectionsDemo.teacher("roraito", learner);
		
		//method reference : format 1 : static method
		//sort is a static method from collection
		Consumer <List<Integer>> lambda= Collections::sort;
		var data = Arrays.asList (1,3,2,5,4);
		System.out.println("antes del cambio: " + data);
		GenericsCollectionsDemo.staticMethod(data,lambda);
		System.out.println("despues del cambio: " +data);

		var StringX ="adc";
		Predicate <String> lambda2= StringX ::startsWith;
		//Predicate <String> lambda2= Collections::sort;
		System.out.print( format2("adcdario", lambda2));
		System.out.print( format2("a", lambda2));

		var random = new Random();
		Supplier <Integer> lambda3 = random::nextInt;
		System.out.println ( format2_2( lambda3));
		
		System.out.println ( "-------------forma 3-------------");
		
		//Predicate <String> l4= String:: isEmpty;
		Predicate <String> l4= m-> m.isEmpty();
		System.out.println ( format3( "",l4));

	}
	
	public static void teacher (String name , LearnToTalk trainer ){
		trainer.talk(name);
	}

	/**
	 *
	 * Primera forma ejemplo-
	 * */
	public static <T> void staticMethod( T methodReference, Consumer<T> lambda ){
		lambda.accept(methodReference);
	}


	public static <T> boolean format2( T data , Predicate<T> lambda){
		return lambda.test(data);
	}

	public static <T> T format2_2 (  Supplier<T> lambda ) {
		return lambda.get();

	}

	public static <T> boolean format3(T data,  Predicate<T> lambda ) {
		return lambda.test(data);

	}

}

@FunctionalInterface
interface LearnToTalk{
	void talk(String sound);
}


