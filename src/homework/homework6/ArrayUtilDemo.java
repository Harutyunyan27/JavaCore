package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {67, 38, 924, 11, 2350, 41, 777, 239, 70, 1007, 81, 273, 83, 490, 845, 120, 4589, 1678, 730};
        ArrayUtil all = new ArrayUtil();
        all.allNumbers(array);
        all.max(array);
        all.min(array);
        all.evenNumbers(array);
        System.out.println();
        all.odd(array);
        System.out.println();
        all.numberOfEven(array);
        all.numberOfOdd(array);
        all.totalAmount(array);
        all.startingAndLastDigits(array);


    }
}
