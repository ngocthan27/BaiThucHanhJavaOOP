package shapes;

public class HinhHoc{

    public final float PI = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float thetich;

    public void xuatTen() {
        System.out.println("\n\n==== " + ten + " ====");
    }

    public void inchuVi() {
        System.out.println("Chu Vi = " + chuVi);
    }

    public void inDientich() {
        System.out.println("Dien Tich = " + dienTich);
    }

    public void inTheTich() {
        System.out.println("The tich = " + thetich);
    }
}