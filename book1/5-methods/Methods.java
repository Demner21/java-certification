public class Methods{

    public static void main(String ...z){
        new Methods().test2(false);
    }
     
    void test(int age){
        System.out.println(age);
    }

    void test2(boolean isValid){
        final int temp;
        test(temp= isValid? 5:6);
    }
}