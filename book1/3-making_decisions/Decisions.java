 import java.io.*;
 final class Decisions {

    static final public void main(String ...z){

        var temp=1;
        switch( temp){
                case 1: case 2 :System.out.println("test");
        }

        Object temp2=5;
        if(temp2 instanceof Integer data){
            System.out.println(data.compareTo(3));
        }

        Object temp3=10;
        if (!(temp3 instanceof Integer data)) return;
        System.out.println(data.intValue());

        var temp6=Integer.valueOf(2);
        var temp4=switch(temp6){
            case 1-> "TEST_1";
            case 2-> {
                    String yield="temp";
                    yield "TEST2"+ yield;

            }            
            default-> 2;
        };

         System.out.println(temp4);

        var demo=Demo.TEST1;
         var demo2=switch(demo){
            case TEST1 -> "a";
            case TEST2 -> "b";
            default-> "c";
         };

         System.out.println(demo2);

            var numberMagic=2;
         var tempVar= switch(numberMagic){
            case 1-> "A";
            case 2-> "B";
            default-> "C";
         };
         System.out.println(tempVar);

    }
}
enum Demo{
    TEST1, TEST2;
}