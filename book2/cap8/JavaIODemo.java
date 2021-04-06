import java.io.*;

public final class JavaIODemo{

	/**
	 * Chapter 8
	 * I/O 
	 * este capitulo se centra en el uso de la api: java.io [que interactua con archivos y streams]
	 *
	 * The File class:
	 * the java.io.File class es usada para leer informacion sobre archivos y directorios que existen, listar el contenido de un directorio
	 * crear/eliminar arvhicos y direcotrios
	 *
	 * Una instancia de la clase File representa el path a un archivo particular o a un directorio del sistema de archivos
	 * La clase File no puede leer o escribir data dentro del archivo, aunque si puede pasar como referencia a varias clases stream para leer o escribir data
	 * 
	 * Para el examen se debe conocer que existen 3 constructores de la clase File:
	 *    1- public File (String pathname)
	 *    2- public File (File parent, String child)
	 *    3- public File (String parent, String child)
	 * Tener en consideracion que la instancia de la clase File solo representa una ruta [de un archivo o de un directorio]
	 * */

	public static void main (String [] a){
		System.out.println(java.io.File.separator);
		var demoFile= new File("demo\\animals.txt");
		var demoFile2= new File("demo" , "animals.txt");
		System.out.println("referencia File del archivo \"animals.txt\"  ha sido creado con la primera forma: "  + demoFile.exists());
		System.out.println("referencia File del archivo \"animals.txt\"  ha sido creado con la segunda forma: "  + demoFile2.exists());
		
		var parent = new File("demo");
		var demoFile3 = new File(parent, "animals.txt");
		System.out.println("referencia File del archivo \"animals.txt\"  ha sido creado con la tercera forma: "  + demoFile3.exists());
		
	}



	static  void i_o_stream_nomenclature(){
		/**
		 * Byte Streams vs Character Streams.
		 * Byte streams leen o escriben data binaria [0 o 1] y poseen clases que sus nombres terminan en : InputStream o OutputStream
		 * Character streams leen o escriben text data y tienen clases que sus nombres terminan en: Reader o Writer
		 *
		 * A menudo la api [java.io] incluye clases de similar nombre para byte and character streams.
		 * la diferencia radica en como los bytes del stream son leidos o escritos:wq  
		 *
		 * */

	}

}



