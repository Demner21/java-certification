public class Test {
    private String name ="Pipo";
    {System.out.println("instance initializer-1");}

    public Test(){
        name="tiny";
    }
     
     static public final void main (final String ... x){
        var test_= new Test();
        {
            System.out.println("Block inside a method");
            test_.name="Lerry";
        }

        System.out.println(test_.name);

    }

}