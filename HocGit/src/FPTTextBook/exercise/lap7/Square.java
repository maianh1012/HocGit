package FPTTextBook.exercise.lap7;

public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
    }

    public double getPerimeter(){
        return side*4;
    }

    public double getArea(){
        return side*side;
    }

    public void ouput(){
        System.out.println("Side: " + getSide() + ", Perimeter: " + getPerimeter() + ",Area: " + getArea());
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
