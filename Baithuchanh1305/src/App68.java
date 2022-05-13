import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class App68 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> tsInt = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        tsInt.add(0);
        tsInt.add(3);
        tsInt.add(1);
        tsInt.add(4);
        tsInt.add(2);
        tsInt.add(8);

        System.out.println("Các phần tử có trong treeSetInteger: ");
        System.out.println(tsInt);
        System.out.println("Nhập phần tử cần thêm: ");
        number = sc.nextInt();


        if (!tsInt.contains(number)) {
            tsInt.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử có trong treeSetInteger sau khi thêm: ");
            System.out.println(tsInt);
        } else {
            System.out.println("Phần tử" + number + "đã tồn tại!");
        }
        sc.close();
    }
}
