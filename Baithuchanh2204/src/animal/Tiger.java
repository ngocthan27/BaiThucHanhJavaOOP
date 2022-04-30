public class Tiger extends Animal {
    void run() {
        System.out.println("chay manh me");
    }

    void eat() {
        System.out.println("an thit");
    }

    void sleep() {
        System.out.println("ngủ dài");
    }

    void walk() {
        System.out.println();
    }

    void roar() {
        System.out.println("gầm");
    }

    public static void main(String args[]) {
        Tiger obj = new Tiger();
        obj.run();
    }
}