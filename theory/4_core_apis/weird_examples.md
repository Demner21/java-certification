# Pattern matching

> This is a correct expression :heavy_check_mark:

```
Object temp2=5;
   if(temp2 instanceof Integer data){
        System.out.println(data.compareTo(3));
   }

```
> This is also a correct expression :heavy_check_mark:
```
        Object temp3=10;
        if (!(temp3 instanceof Integer data)) return;
        System.out.println(data.intValue());
```


> Incorrect expression :x:
```
        Object temp3=10;
        if (!(temp3 instanceof Integer data)) return;
        System.out.println(temp3.intValue());
```