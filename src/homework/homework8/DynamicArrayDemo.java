package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray myArray = new DynamicArray();
        myArray.add(27);
        myArray.add(34);
        myArray.add(67);
        myArray.add(21);
        myArray.add(54);
        myArray.add(37);
        myArray.add(58);
        myArray.add(90);
        myArray.add(41);
        myArray.add(22);
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.print();
        myArray.deleteByIndex(7);
        myArray.print();
        myArray.set(4, 888);
        myArray.print();
        myArray.add(10, 777);
        myArray.print();
        System.out.println("\n" + myArray.getIndexByValue(2));

    }
}