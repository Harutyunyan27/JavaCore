package homework.homework8;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "[H{]e{ll)o (from) [Java} ";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }


}
