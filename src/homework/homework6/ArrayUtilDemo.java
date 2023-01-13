package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {67, 38, 924, 11, 2350, 41, 777, 239, 70, 1007, 81, 273, 83, 490, 845, 120, 4589, 1678, 730};
        ArrayUtil AllNumbers = new ArrayUtil();
        AllNumbers.AllNumbers(array);
        ArrayUtil Max = new ArrayUtil();
        Max.Max(array);
        ArrayUtil Min = new ArrayUtil();
        Min.Min(array);
        ArrayUtil EvenNumbers = new ArrayUtil();
        EvenNumbers.EvenNumbers(array);
        System.out.println();
        ArrayUtil Odd =  new ArrayUtil();
        Odd.Odd(array);
        System.out.println();
        ArrayUtil NumberOfEven = new ArrayUtil();
        NumberOfEven.NumberOfEven(array);
        ArrayUtil NumberOfOdd = new ArrayUtil();
        NumberOfOdd.NumberOfOdd(array);
        ArrayUtil TotalAmount = new ArrayUtil();
        TotalAmount.TotalAmount(array);
        ArrayUtil StartingAndLastDigits = new ArrayUtil();
        StartingAndLastDigits.StartingAndLastDigits(array);


    }
}
