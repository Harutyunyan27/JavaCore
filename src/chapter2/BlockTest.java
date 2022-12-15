package chapter2;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("Значение х " + x);
            System.out.println("Значение y " + y);
            y = y - 2;
        }
    }
}
