import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hsStr = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        hsStr.add("Willson");
        hsStr.add("Nike");
        hsStr.add("Volvo");
        hsStr.add("Kia");
        hsStr.add("Lenovo");
        hsStr.add("Lenovo");

        System.out.println("Các phần tử có trong hashSetString: ");
        System.out.println(hsStr);
        System.out.println("Nhập phần tử cần xoa: ");
        name = scanner.nextLine();

        if (hsStr.contains(name)) {
            hsStr.remove(name);
            System.out.println("Xóa thành công!");
            System.out.println("Các phần tử còn lại trong hashSetString: ");
            System.out.println(hsStr);
        } else {
            System.out.println("Xóa không thành công! ");
        }
        
        scanner.close();
    }
}
