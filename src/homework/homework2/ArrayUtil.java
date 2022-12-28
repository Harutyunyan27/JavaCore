package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        System.out.println("1.");
        int[] array = {67, 38, 924, 11, 2350, 41, 777, 239, 70, 1007, 81, 273, 83, 490, 845, 120, 4589, 1678, 730};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("2.");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("max " + max);
        System.out.println("3.");
        int[] myArray = new int[11];
        myArray[0] = 89;
        myArray[1] = 3748;
        myArray[2] = 92;
        myArray[3] = 63;
        myArray[4] = 436;
        myArray[5] = 1890;
        myArray[6] = 35;
        myArray[7] = 563;
        myArray[8] = 45;
        myArray[9] = 123;
        myArray[10] = 75;
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min)
                min = myArray[i];
        }
        System.out.println("min " + min);
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println("զույգ թիվ է " + myArray[i]);
            } else {
                System.out.println("կենտ թիվ է " + myArray[i]);
            }
        }
        System.out.println();
        System.out.println("զույգ թվեր ");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.print(myArray[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Կենտ թվեր");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.print(myArray[i] + ", ");
            }
        }
        System.out.println();
        int evenNumbers = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("Even Numbers " + evenNumbers);
        int notEven = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0)
                notEven++;
        }
        System.out.println("Not Even " + notEven);
        int totalAmount = 0;
        for (int i = 0; i < myArray.length; i++) {
            totalAmount += myArray[i];
        }
        System.out.println("Total Amount " + totalAmount);
        System.out.println("the arithmetic mean " + totalAmount / myArray.length);
        System.out.println(myArray[0]);
        int i = myArray.length - 1;
        System.out.println(myArray[i]);
    }
}
