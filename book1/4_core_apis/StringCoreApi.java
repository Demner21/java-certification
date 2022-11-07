public class StringCoreApi{
    public static void main(String ...Z){
        var tmp=new StringCoreApi();
        tmp.weirdConcatenation();


        var name="""
        Dmnr""";        

        System.out.println(name);

        var temp2=new int[5][5];

        System.out.println(temp2);
    }

    void weirdConcatenation(){
        System.out.println("---begin tests weird concatenation");  //si compila
        System.out.println(3+6);  //9
        System.out.println("3+6");  //3+6
        System.out.println("3"+"6");  //36
        System.out.println("3"+"6"+ 3);  //363
        System.out.println(3+6+"3");  //93
        System.out.println("3"+6+3);  //363
        System.out.println("3"+null);  //3null
        System.out.println("3"+!!!!false);  //3false
        //System.out.println(3+null);  // ?  ...weird  : no compila
        System.out.println(3+4+"a"+"true"+ true + false);  // ...mega weird :: si compila!!!
        System.out.println(3+4+"a"+"true"+ true + !false);  // ...mega weird :: si compila!!!
        //System.out.println(true + !false);  //bad:: el operand + no lo acepta
        //System.out.println(3+4+ "a"+"true".concat(true) +!false);  //bad::method concat only accept String as argument
        System.out.println(3+4+ "a"+"true".concat("true") +!false);  //si compila

        System.out.println(null + "123");  
        //System.out.println(null + 123);  //bad::no compila
        System.out.println("---end tests weird concatenation");  //si compila

        var s="1";
        s+="2";
        s+=3;

        System.out.println(s);  //123

        String z=null;
        z+="1";
        z+=2;
        System.out.println(z);  //null12

    }
}