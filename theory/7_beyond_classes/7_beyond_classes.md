# Objetivos 
- Crear y usar interfaces, idedntificar interfaces funcionales y utilizar métodos privados, static y default en interfaces
- Declarar e instanciar objetos java incluyendo objetos de clases nested
- Explicar el ciclo de vida del objeto: creacion, reasignacion de referencia y garbage collection


# Implementar interfaces
>Una clase puede implementar cualquier numero de interfaces

>Una interface es un tipo de dato ***abstracto*** que declara una lista de métodos abstractos que cualquier clase debe implementar
- The most simple interface example
```
public abstract interface MySimpleInterface{
}
```
- An nterface with one simple method and one constant
```
public abstract interface MyInterface{
    public abstract int getTip(); // public and abstract are implicit modifiers
    public static final String MY_CONSTANT="C"; //public static and final are implicit modifiers
}
```

## Declarando herencia
```
public class Mammal{} //parent class::superclass

public final class Rhinoceros extends Mammal {}  //child class ::subclass
```

## Modificadores de clase
|modifier |description| chapter covered |
|------|------------------------------|----------|
|final |the class may not be extended| chapter 6|
|abstract |the class is abstract, may contain abstract methods, and requires a concrete subclass to instantiate| chapter 6|

# Inicializando objetos


