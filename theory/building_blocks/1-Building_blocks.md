### Objetivos 

- Trabajar con fechas. tiempo, texto, valores númericos y booleanos
- Clases inmutables
- Clases inmutables


> JDK contiene el software minimo que se necesita para desarrollar con Java.

comandos básicos
- javac : generar java filess en .class bytecode
- java : ejecutar un programa
- jar : empaquetar archivos
- javadoc : generar documentacion

### Averigua tu versión de jdk:
> javac -version

> java -version

> desde java 11 se puede compilar y ejecutar solo con el comando **java**


# Entendiendo las Clases
Classes are the basic ***building blocks***
- Other building blocks:
    -   interfaces
    -   records
    -   enums

> An ***Object*** is a runtime instance of a class in memory

> A ***reference*** is a variable that points to an object

## Fields and Methods 
- Fields: campos: variables de instancia
- Methods: métodos 

The most simple java class
```
public class Exam{
    String name;

    public String getName(){}
}
```

JAVA BEANS: es una convension para escribir getter and setters

## Tipos de comentarios

```
/* example comment*/

/**
* other comment
*/

// another comment

```
## Classes and source files

> A ***top-level type*** is a data structure that can be defined independently within a source file

The most simple *top-level* type example
```
public class Exam{
    String name;
}
```

> Si la clase es publica, la clase debe llamarse igual que el archivo (sensitive case)

```
public class Exam{
    String name;
}
class Certification extends Exam{}
```

# Formas de escribir un main

```
public static void main (String[] args){}
public static void main (String args[]){}
public static void main (String... args){}
public final static void main (final String... args){}
final public static void main (final String... args){}
static public void main (final String... args){}
```

# Entendiendo declaración de paquetes e imports

### Packages
Java classes are grouped into packages. The import statement tells the compiler which package to look in to find a class
> solo aceptan letras y números separados por puntos

> java.lang es importado por defecto


package pe.dmnr.exam :heavy_check_mark:

package pe.dmnr.exam.test :heavy_check_mark: also is a child packages of pe.dmnr.exam

package pe.dmnr-bad :x:

package PE.DMNER_BAD :x:

### Wildcards

### Creando un nuevo package
```
package packagea
public class ClassA{}

package packageb
public class ClassB{
    static final public void main(String z[]){
        ClassA reference_a;
        System.out.println("Done");
    }
}
```
### Compilando y ejecutando codigo con paquetes
--compilar
> javac packagea/ClassA.java packageb/ClassB.java

--ejecutar
> java packageb/ClassB

### Compilando en otro directorio
Por defecto el comando **javac** compila las clases
> javac -d classes packagea/ClassA.java  packageb/ClassB.java

--para ejecutar
> java -cp classes packageb.ClassB

> java -classpath classes packageb.ClassB

> java --class-path classes packageb.ClassB

# Creando objetos
En esta seccion se verán
- constructores
- variables de intancia

### Ejecutando bloques de inicializacion de instancia
The code between the braces is called a *code block*
If a *code block* appears outside a method is called *instance initializer*
```
public class Bird {
    static public final void main (String ... x){
        {System.out.println("Block inside a method");}
    }
    //This is a *instance initializer*
    {
        System.out.println("Block inside a method");
    }
}
```

### Siguiendo el orden de inicializacion
- Campos y bloques de inicializacion de instancia son ejecutados en el orden en el cual ellos aparecen en el archivo
- El constructor se ejecuta despues de que todos los campos y bloques  de inicializacion de instancia se han ejecutado.

```
public class Test {
    private String name ="Pipo";
    {System.out.println("instance initializer-1");}

    public Test(){
        name="tiny";
    }
     
     static public final void main (final String ... x){
        var test_= new Test();
        {
            System.out.println("Block inside a method");
            test_.name="Lerry";
        }

        System.out.println(test_.name);

    }

}
```




