package creational.singleton;

public class main {
    public static void main(String[] args) {
        singleton instance1 = singleton.getInstance();
        singleton instance2 = singleton.getInstance();
        singleton instance3 = singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}
