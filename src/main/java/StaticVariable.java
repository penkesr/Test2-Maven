public class StaticVariable {

    // Static variable
    static int x = 30;

    public static void main(String[] args) {
        System.out.println("Static variable x: " + x);
        x = 40;  // Modifying static variable
        System.out.println("Modified static variable x: " + x);
    }
}
