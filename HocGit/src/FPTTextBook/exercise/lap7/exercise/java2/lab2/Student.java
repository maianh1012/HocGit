package FPTTextBook.exercise.lap7.exercise.java2.lab2;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private int id;
    private String fullName;
    private double mark;
    private String academicStrength;

    public Student() {
    }

    public Student(int id, String fullName, double mark, String academicStrength) {
        this.id = id;
        this.fullName = fullName;
        this.mark = mark;
        this.academicStrength = academicStrength;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getAcademicStrength() {
        return academicStrength;
    }

    public void setAcademicStrength() {
        if(mark>=8){
            academicStrength = "Great";
        }else if(mark>=7){
            academicStrength = "Cool";
        }else if(mark >=5){
            academicStrength = "Normal";
        }else{
            academicStrength = "Weak";
        }
    }

    @Override
    public String toString() {
        return getId() + "\t" + getFullName() + "\t" + getMark() + "\t" + getAcademicStrength() + "\n";
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter student's id:");
            int idd = input.nextInt();
            this.setId(idd);
        }catch (InputMismatchException e){
            System.out.println("You have to enter a integer number");
            throw  e;
        }

        System.out.println("Enter student's full name:");
        input.nextLine();
        String fullnamee = input.nextLine();
        setFullName(fullnamee);
        if(this.fullName.equals("")){
            System.out.println("You did not enter anything");
            throw new InputMismatchException();
        }

        try {
            System.out.println("Enter student's mark:");
            setMark(input.nextDouble());
        }catch (InputMismatchException e){
            System.out.println("You have to enter a double number");
            throw e;
        }
        this.setAcademicStrength();
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        try {
            student1.input();
        }catch (InputMismatchException e){
            System.out.println("Enter student's info again: ");
            student1.input();
        }
        System.out.println("Student's infomation: "+student1);
    }
}
