# Bad examples of interfaces :x:
```
public final abstract interface BadMofifier{} //doesn't compile

//.\book1\7-beyond_classes\BeyondClasses.java:1: error: illegal combination of modifiers: interface and final
```

# Good examples of interfaces :heavy_check_mark:
```
abstract interface GoodMofifier1{} 
public abstract interface GoodMofifier2{} 

interface GoodModifierSimplified1{}
public interface GoodModifierSimplified2{}
```

# Trying to instantiate an interfaces :x:
> This is not valid, an interface cannot be instantiate
```
public interface GoodModifierSimplified2{}

public class Temp implements GoodModifierSimplified2{
     public static void main(String ...x){
            var temp= new GoodModifierSimplified2(); // doesn't compile
     } 
}

```