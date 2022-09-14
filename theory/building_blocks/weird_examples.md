
# Failed cases :x:
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


# Success cases :heavy_check_mark:
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
