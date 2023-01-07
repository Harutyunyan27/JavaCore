package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a', 'L', 'o', 'v', 'e'};
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = 'o';
            if (chars[i] == c) {
                x++;
            }
        }
        System.out.print("'o'-ից կա " + x + " հատ");
        System.out.println();
        char[] chars2 = {'J', 'a', 'v', 'a', 'L', 'o', 'v', 'e'};
        int t, z;
        z = chars2.length / 2;
        t = chars2.length / 2 - 1;
        System.out.print(z + " - " + t);
        System.out.println();
        char[] chars3 = {'J', 'a', 'v', 'a', 'L', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y')
            System.out.println("l - y ");
        char[] text = {' ', ' ', 'B', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 2; i < text.length -2; i++) {
            System.out.print(text[i]);
        }
    }
}

