package one;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 123;

     /*   for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        for (int number : numbers) {
            System.out.println(number);

        }*/


        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(23);
        dynamicArray.add(24);
        dynamicArray.add(123);
        dynamicArray.remove(0);
        for (int number:
             dynamicArray) {
            System.out.println(number);

        }


    }

}
