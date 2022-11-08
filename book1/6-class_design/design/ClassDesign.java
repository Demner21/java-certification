package design;
public final class ClassDesign extends SuperDesign{

    protected int speed=10;

    static final public void main(String... Z){
         var temp= new ClassDesign();
         temp.doSomething();  
         var temp2=new WeakDesign();
         temp2.doSomething(); 
    }

}

class SimpleDesign extends SuperDesign{
    protected int speed=5;
}

class WeakDesign extends SimpleDesign{
    protected int speed=2;
    void doSomething(){
        System.out.println(super.speed);
    }
}