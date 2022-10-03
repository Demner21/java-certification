public class Operators{


    final static public void main (String ...z){

        var d="""
            linea1     
            linea2  \s
            """;

        System.out.println(d)    ;
        System.out.println("----")    ;
        var b="linea1\nlinea2  \s\n";
        System.out.println(b)    ;
        System.out.println("----")    ;
        System.out.println(b.equals(d))    ;
        System.out.println(b.trim().equals(d.trim()))    ;

        System.out.println("----");

        //Test post unary operator
        var test= 5;
        //var test += --test + test++; not compile
        //my answer: 14 - true answer: not compile

        //test = --test + test++;
        //my answer: 9 - true answer: 8

        var demo= 9.8;
        //my answer:9  - true answer:9
        System.out.println((int) demo);
        
        test= test++ *  --test ;
        
        //my answer:25  - true answer: 25

        System.out.println(test);
    }
}