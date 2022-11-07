# Objetivos 
Manejar fechas, horas y texto, número y valores booleanos


# Creating and manipulating Strings
>A string is basically a sequence of characters

>String is a special class and doesn't need to be instantiated with new

```
String name="Dmnr";
var name="Dmnr";
String name=new String("Dmnr");
var name=new String("Dmnr");
var name="""
        Dmnr""";
String name="""
        Dmnr""";        
```
## Concatenating
> Placing one String before the other String and combinig them is called String ***concatenation*** 

```
var exampleConcatenation="A" + "B";
```

### Rules
- If both operands are numeric, + means numeric adtion
- If either operand is a String, + means concatenation
- The expression is evaluated left to right

> check StringCoreApi::weirdConcatenation
```
System.out.println(3+6);  //9
System.out.println("3+6");  //3+6
System.out.println("3"+"6");  //36
System.out.println("3"+"6"+ 3);  //363
System.out.println(3+6+"3");  //93
System.out.println("3"+6+3);  //363
System.out.println("3"+null);  //3null
System.out.println(3+null);  // ?  ...weird :: no compila
System.out.println(3+4+"a"+"true"+ true + false);  // ...mega weird :: si compila!!!
```



