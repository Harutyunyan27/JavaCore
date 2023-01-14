package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {67, 38, 924, 11, 2350, 41, 777, 239, 70, 1007, 81, 273, 83, 490, 845, 120, 4589, 1678, 730};
        ArrayUtil All = new ArrayUtil();
        All.allNumbers(array);
        All.max(array);
        All.min(array);
        All.evenNumbers(array);
        System.out.println();
        All.odd(array);
        System.out.println();
        All.numberOfEven(array);
        All.numberOfOdd(array);
        All.totalAmount(array);
        All.startingAndLastDigits(array);


    }
}
