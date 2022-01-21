import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //khai bao bien
    double hesoa, hesob, hesoc, delta;
    double x1,x2;
    // doc du lieu nhap
    Scanner sc = new Scanner (System.in); 
    //phep gan
    System.out.println("nhap he so a: ");
        hesoa = sc.nextDouble();
    System.out.println("nhap he so b: ");
        hesob = sc.nextDouble();
    System.out.println("nhap he so c: ");
        hesoc = sc.nextDouble();
    sc.close();
    delta = hesob * hesob - 4 * hesoa * hesoc;
    
    if (delta > 0) {
        x1= (-hesob + Math.sqrt(delta))/2* hesoa;
        x2= (-hesob - Math.sqrt(delta))/2* hesoa;
        System.out.println("phuong trinh co nghiem la : x1 =, x2 = " + x1 + x2);
    }
    else if (delta == 0){
        x1= -hesob/2*hesoa;
        x2= -hesob/2*hesoa;   
        System.out.println("phuong trinh co nghiem kep : x1=x2=" + x1);
    }
    else {
        System.out.println("Phuong trinh vo nghiem!");
    }
}
}
