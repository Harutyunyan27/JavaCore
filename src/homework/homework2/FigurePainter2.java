package homework.homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        System.out.println("1.");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 10; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("2.");
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 9; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
