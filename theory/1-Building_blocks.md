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



### Entendiendo las Clases
- campos: variables de instancia
- metodos 

JAVA BEANS: es una convension para escribir getter and setters

Tipos de comentarios

```
/* example comment*/

/**
* other comment
*/

// another comment

```


> Si la clase es publica, la clase debe llamarse igual que el archivo (sensitive case)

### formas de escribir un main

```
public static void main (String[] args){}
public static void main (String args[]){}
public static void main (String... args){}
public final static void main (final String... args){}
final public static void main (final String... args){}
static public void main (final String... args){}
```


### Packages
> solo aceptan letras y números separados por puntos

> java.lang es importado por defecto


package pe.dmnr :heavy_check_mark:
package pe.dmnr-bad :x:
package PE.DMNER_BAD :x:

