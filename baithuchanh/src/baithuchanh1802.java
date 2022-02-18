import java.util.Scanner;
public class baithuchanh1802 {
    public static void main(String[] args) throws Exception {
        int a,b;
        int c = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap vao mot so nguyen duong: ");
        a = scanner.nextInt();

        while (a <= 0) {
            System.out.println("So nhap phai lon hon 0. Moi ban nhap lai: ");
            a = scanner.nextInt();
        }
        
        while (a >=0) {
            b = a % 10;
            c += b;
            a /= 10;
        }
        
        System.out.println("Tong cac chu so =" +a);
        
        scanner.close();
    }
}
