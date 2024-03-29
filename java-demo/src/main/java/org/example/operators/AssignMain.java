package org.example.operators;

public class AssignMain {
    public static void main(String[] args) {
        Character dd = 2; //Autoboxing
        byte myByte = 2;
        char myChar2 = (char) myByte;

        Integer kk = 2;
        int hh = 2;
        float mmm = hh; // int to float
        short jj = 2;
        char tt = (char) hh;
        tt = (char) jj;


        //byte - short - int - long
        //float - double

        //boolean
        //char

        int number_int = 21;
        double number_double = number_int;
        System.out.println(number_double);
        //Double wrapper_double=(Double) number_int; // bad casting
        Double wrapper_double_2 = (double) number_int; // better casting

        //char to long
        //long is more higher than char
        System.out.println("//char to long");
        char mychar = '3';
        long valueLong = mychar;
        System.out.println(valueLong);
        System.out.println((byte) mychar);
        System.out.println((byte) valueLong);

        //byte to short
        System.out.println("//byte to short");
        byte smallByte = '4';
        short otherShort = smallByte;
        System.out.println(otherShort);

        //short to char --needs a cast
        System.out.println("//short to char --needs a cast");
        short anotherShort = '5';
        char myChar = (char) anotherShort;
        System.out.println(myChar);
        anotherShort = (short) myChar;
        System.out.println(anotherShort);

        //long to char--needs a cast
        System.out.println("//long to char--needs a cast");
        long otherLong = 5;
        char other_char_2 = (char) otherLong;


        //creating arrays
        var demo = new String[]{"a", "b"};
        String[] sa = new String[]{"a", "b"};

        Integer[] integersArray = new Integer[]{1, 2, 3, 4, 5};
        for (var integer : integersArray) {
            System.out.println(integer);
        }


    }
}
