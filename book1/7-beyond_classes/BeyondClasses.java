//final abstract interface BadMofifier{} //doesn't compile
abstract interface GoodModifier{
    static void foo(){
        System.out.println("foo");
    }
    private static void foo2(){}
} 

//simple enum
enum Season{
    WINTER,SPRING,SUMMER,FALL;
}

public class BeyondClasses implements GoodModifier{
     public static void main(String ...x){
            var temp= new BeyondClasses();
            var myEnum=Season.FALL;
            System.out.println(myEnum.name());
            System.out.println(myEnum);
            System.out.println(myEnum.toString());
     }
}
