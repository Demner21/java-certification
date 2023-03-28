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
# Records bad examples
## Trying to use a canonical constructor without set field :x:

   ```
    public record MyRecord(String name){

        public MyRecord(String name){
            name = name.isBlank() ? "Tom" : name;
        }
    }
   ``` 

## Triying to initialize and after call the canonical constructor :x:
   ``` 
   package org.example.record;

     public record Period(int minutes) {
    
     public Period() {
        this.minutes=0;
        this(0); // call the canonical constructor
    }

}

   ``` 
## Not using canonical constructor :x:
   ``` 
   package org.example.record;
     
     /**

     An overloading record constructor is required to explicitly delegate to another record constructor on the first line. The requirement exists because all construction must eventually delegate to the canonical constructor. Any overloading constructor must delegate to another constructor using this(...) on its first line. You can therefore conclude that the code does not compile, and option B is incorrect.
     
     */
   

     public record Period(int minutes) {

          public Period() {
               this.minutes=0;
          }

     }
   ```
 ## Rigth way    
   ``` 
   package org.example.record;

     public record Period(int minutes) {

          public Period() {
               this(0);
          }

     }

   ``` 

