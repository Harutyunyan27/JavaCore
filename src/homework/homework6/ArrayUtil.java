package homework.homework6;

public class ArrayUtil {

    void AllNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void Max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("max " + max);
    }

    void Min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];

        } System.out.println("min " + min);
    }

    void EvenNumbers(int[] array) {
        System.out.println("զույգ թվեր ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + ", ");
        }

    }

    void Odd(int[] array) {
        System.out.println("Կենտ թվեր ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void NumberOfEven(int[] array) {
        int EvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                EvenNumbers++;
            }
        }
        System.out.println("Զույգերի քանակը " + EvenNumbers);
    }

    void NumberOfOdd(int[] array) {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                odd++;
        }
        System.out.println("Կենտերի քանակը " + odd);

    }

    void TotalAmount(int[] array) {
        int TotalAmount = 0;
        for (int i = 0; i < array.length; i++) {
            TotalAmount += array[i];
        }
        System.out.println("Ընդհանուր գումար " + TotalAmount);
        System.out.println("Միջին թվաբանականը " + TotalAmount / array.length);
    }

    void StartingAndLastDigits(int[] array) {
        System.out.println(array[0]);
        int i = array.length - 1;
        System.out.println(array[i]);
    }


}

