> this operation is not valid

> This not execute! :x:
```
$ java --classpath ./classes/ Operators

```
> Bad use of assigment += :x:
```
 var test= 5;
 var test += --test + test++;
```

## Bad casting
```
package org.example.operators;

public class AssignMain {
    public static void main(String[] args) {
        int number_int=21;
        double number_double=number_int;
        //Double wrapper_double=(Double) number_int; // bad casting
        Double wrapper_double_2=(double) number_int; // better casting
        
    }
}
```

## Final variables and casting
Further, if you have a final variable and its value fits into a smaller type, then you can assign it without a cast because compiler already knows its value and realizes that it can fit into the smaller type.

> This is called implicit narrowing (it is implicit because there is not explicit cast) and is allowed between byte, int, char, and, short but not for long, float, and double.


```
byte b = 20;
final int k = 10;
b = k; //Okay because k is final and 10 fits into a byte
```

```
int i = 10;
final float f = 10.0;//will not compile
//because 10.0 is a double even though the value 10.0 fits into a float
i = f;//will not compile either even after changing 10.0 to 10.0f.
```

