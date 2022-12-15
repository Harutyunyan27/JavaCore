package chapter2;

public class Example2 {
    public static void main(String[] args) {
        int num;
        num = 100;
        {
            System.out.println(" Это переменноя num" + num);
            num = num * 2;
        }
        {
            System.out.print("Значение переменной num * 2 равно ");
        }
        {
            System.out.println(num);
        }
    }
}
