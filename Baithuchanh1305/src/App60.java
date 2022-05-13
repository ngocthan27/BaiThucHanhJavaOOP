import java.util.LinkedHashSet;
import java.util.Set;

public class App60 {
    public static void main(String[] args) {
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Java");
        lhs.add("C++");
        lhs.add("Java");
        lhs.add("PHP");

        for (String str : lhs) {
            System.out.println(str);
        }
    }
}
