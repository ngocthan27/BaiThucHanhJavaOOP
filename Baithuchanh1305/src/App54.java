import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) {
        int number;
        HashSet <Integer> hsint = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        hsint.add(0);
        hsint.add(3);
        hsint.add(1);
        hsint.add(4);
        hsint.add(2);
        hsint.add(8);

        System.out.println("Các phần tử trong hashSetInterger: ");
        System.out.println(hsint);
        System.out.println("Nhập phần tử cần thêm: ");
        number = scanner.nextInt();

        if (!hsint.contains(number)) {
            hsint.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử hashSetInteger");
            System.out.println(hsint);
        } else {
            System.out.println("Phần tử " + number + " đã tồn tại!");
        }
        scanner.close();
    }
}
