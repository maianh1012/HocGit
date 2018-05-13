package FPTTextBook.exercise.lap7;

public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle() {
    }

    public double getPerimeter(){
        return (side1+side2)*2;
    }

    public double getArea(){
        return side1*side2;
    }

    public void output(){
        System.out.println("side 1: " + getSide1() + ", side2: " + getSide2() + ", Perimeter: " + getPerimeter() + ", Area: " + getArea());
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
}
