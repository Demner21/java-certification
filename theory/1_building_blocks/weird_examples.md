
# Failed cases of compilation :x:
### Case 1
> java Exam :x: 

**THIS IS WRONG** NEED .java extension at the end of the file. Only work for a simple one file java program. This feature is called ***single-file source code***

> java Exam.java :x:

> javac Exam.java :x:

```
class Exam{
 static	public void main([] String z){
	System.out.println("Failed to compile");
 }
}
// Failed because the order of [] is wrong
```


# Success cases of compilation :heavy_check_mark:
### Case 1
> java Exam.java
```
class Exam{
 static	public void main(String [] z){
	System.out.println("Success");
 }
}
//Work inclusive if public access modifier is not present
```
```
class Exam{
 final static public void main(final String [] z){
	System.out.println("Success");
 }}
// Work with final modifier
```
```
class Exam{
  static final public void main(final String [] z){
	System.out.println("Success");
 }
}
//Work with different order of static final - final static
```
```
class Exam{
  static final public void main(final String [] z)
  	throws RuntimeException{
	System.out.println("Success");}}
//RuntimeException is also into java.lang package and in java.base module	
```
```
class Exam{
  static final public void main(final String [] z)
  	throws RuntimeException{
	System.out.println("Success");}}
//Exception is also into java.lang package and in java.base module	
```

```
//compilar en el directorio classes
javac -d classes Exam.java
// el siguiente comando falla:
//Considera la siguiente estructura
/**
  -book1
    -1-building_blocks
      -Test.java
  -classes
*/
javac  -d ./classes/  --class-path ./book1/1-building_blocks/Test.java [incorrecto::: comando mal usado]

javac  -d ./classes/  \
   --class-path ./book1/1-building_blocks/  \
   ./book1/1-building_blocks/Test.java  [comando correcto]


//ejecutar usando el directorio classes
java -cp classes Exam
//crear un jar llamar myJar.jar tomando los .class del directorio classes y colocalo en mi directorio actual
jar -cvf myJar.jar -C classes .
```
# Succes cases of initialization :heavy_check_mark:
```
public class Test{
  final void _t€st(){
  int $myVar_1;
 int €myVar_2;
    if(true){
        $myVar_1=21;
           €myVar_2=37;
       }else{
          €myVar_2=21;}
}
}
```

# Failed cases of uses of block texts :x:

```
 var demo="""test
            """;
```


# Failed cases of uses of VAR :x:

```
 var m=null; //no compila
 Strinb a, var b=4;
 public final void (var a , var b){}

 var number=7;
 number="test";
### inicialización de variables
Variables locales

