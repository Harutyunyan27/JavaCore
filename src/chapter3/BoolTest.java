package chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b ravno  " + b);
        b = true;
        System.out.println("b равно " + b);
        if (b) System.out.println("этот код выполняется.");
        b = false;
        if (b) System.out.println("этот код не выполняется. ");
        System.out.println("10 > 9 " + (10 > 9));


    }
}