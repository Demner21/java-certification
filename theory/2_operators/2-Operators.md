# Objetivos 
Use primitivee and wrappers classes including Math API, parentheses, type promotion and casting to evaluate arithmetic and boolean expressions

# Understanding Java operators
A java operator is a special symbol that can be applied to a set of variables,values, or literals and that returns a result

A simple java operation
```
var a= b+c;
// the result is assigned to a
// a and b are operands
// + is the operator
```

## Types of operators
> java supports three flavors of operators: unary, binary and ternary

>java operators are not necesarily evaluated from left to right order

## Operator precedence
Determining which operators are evaluated in what order is referred to as ***operator precedence***


# Applying Unary operators
A unary operator is one that requires exactly one operand, or variable to function.
```
!a, ~b, +c , -d, ++e f++,--f h--, (String) x
```
## Complement and negation operators
>The logical complement operator: !; only applied only to boolean expressions

>The bitwise operator: ~; only applied only to integer values

>The negation operator: -; reverses the sign of a numeric expression

## Increment and decrement operators
- Applied to numeric variables
- Have high order of precedence

> increment operator: ++

> decrement operator: --

| Operator       | Example | Description                                       |
|----------------|---------|---------------------------------------------------|
| Pre-increment  | ++v     | Incrementa el valor en 1 y retorna el nuevo valor |
| Pre-decrement  | --z     | Decrementa el valor en 1 y retorna el nuevo valor |
| Post-increment | v++     | Incrementa el valor en 1 y retorna  antiguo valor | 
| Post-decrement | z--     | Decrementa el valor en 1 y retorna  antiguo valor | 


# Working with binary arithmetic operators
Binary operators: that take two operands


```
var miVar=5;
var myOtherVar=3;

var=miVar++ * --myOtherVar + ++miVar - --myOtherVar;
```