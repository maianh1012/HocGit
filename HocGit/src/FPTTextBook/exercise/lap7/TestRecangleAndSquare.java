package FPTTextBook.exercise.lap7;

import java.util.Scanner;

public class TestRecangleAndSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1 of rectangle 1: ");
        double side1R1 = scanner.nextDouble();
        System.out.println("Enter side 2 of rectangle 1: ");
        double side1R2 = scanner.nextDouble();
        System.out.println("Enter side of square: ");
        double sideS = scanner.nextDouble();

        Rectangle r = new Rectangle();
        r.setSide1(side1R1);
        r.setSide2(side1R2);
        Square s = new Square();
        s.setSide(sideS);

        System.out.println("Rectangle: ");
        r.output();
        System.out.println("Square: ");
        s.ouput();
    }
}
