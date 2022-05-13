import java.util.ArrayList;
public class App17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInterger = new ArrayList<>();

        arrListInterger.add(0);
        arrListInterger.add(7);
        arrListInterger.add(1);
        arrListInterger.add(9);

        System.out.println("Các phần tử có trong arrListInterger là: ");
        for (int number : arrListInterger) {
            System.out.println(number + "\t");
        }
    }
}
