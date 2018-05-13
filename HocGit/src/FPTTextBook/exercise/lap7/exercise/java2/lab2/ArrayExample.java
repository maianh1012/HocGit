package FPTTextBook.exercise.lap7.exercise.java2.lab2;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter element " + i + ":");
            array[i] = scanner.nextInt();
        }

        try{
            System.out.println("Enter element 6:");
            array[5] = scanner.nextInt();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Element's index is over the number of element");
        }
    }
}
