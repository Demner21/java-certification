package zoo.animal.feeding;

import java.util.List;
import java.util.stream.Stream;

public class Task {

    public List<String> getData() {
        return Stream.of("a", "b", "c").toList();
    }

    public static void main(String[] args) {
        System.out.println("Hello there from Narnia");
    }
    
}
