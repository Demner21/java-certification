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


    }
}