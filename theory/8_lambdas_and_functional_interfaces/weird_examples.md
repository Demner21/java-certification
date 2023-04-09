# Bad examples of Lambdas :x:
No se puede usar var con lambdas
```
var predicate = (String a) -> {
                return a.isEmpty();};

```

# Good examples java.util.function.Predicate<T>-test :heavy_check_mark:
```
 Predicate<String> predicateString = (String a) -> {
     return a.isEmpty();
 };
 Predicate<String> predicate = (a) -> a.isEmpty();
 Predicate<String> predicate_2 = a -> a.isEmpty();
 Predicate<String> predicate_3 = String::isEmpty;
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