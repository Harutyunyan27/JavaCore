package homework;

public class IfForExample {
    public static void main(String[] args) {

            int a, b;

            a = 10;
            b = 40;
            for (int i = a; i <= b; i++) {
                if (i == b) {
                    System.out.println("max" + i);
                }

            }

            int e, c;
            e = 50;
            c = 70;
            for (int i = 50; i <= 70; i++) {
                System.out.print(" " + i);

            }
            System.out.println();

            char q, w;
            q = 77;
            w = 99;
            {
                System.out.println(q + " " + w);
            }
            char ch1 = (char) 1234;
            char ch2 = (char) 4321;
            System.out.println(ch1 + " " + ch2);


            int v, z;
            v = 10;
            z = 20;

            if (v == z) {
                System.out.println(" V հավասար չէ Z" + (v == z));
            }
            if (v > z) {
                System.out.println("V մեծ չէ Z" + (v > z));
            }

            if (v < z)
                System.out.println("Z մեծ է V " + (v < z));
        }
    }
