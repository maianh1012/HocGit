package FPTTextBook.ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import FPTTextBook.ClassAndOOP.Students;

public class SVPoly {
	public String fullName;
	public double mark;
	
	public SVPoly() {
	}
	
//	public SVPoly(String fullName, double mark){
//		this.fullName= fullName;
//		this.mark = mark;
//	}
	public static void main(String[] args) {
		ArrayList<SVPoly> students = new ArrayList<>();
		SVPoly student1 = new SVPoly();
		input(student1);
		students.add(student1);
		SVPoly student2 = new SVPoly();
		input(student2);
		students.add(student2);
		SVPoly student3 = new SVPoly();
		input(student3);
		students.add(student3);
//		SVPoly student4 = new SVPoly();
//		input(student4);
//		students.add(student4);
//		SVPoly student5 = new SVPoly();
//		input(student5);
//		students.add(student5);

		System.out.println("The list of students:");
		output(students);
		System.out.println("");
		
		outputByMark(students);
		
		System.out.println("Type the full Name of the student that you want to find:");
		Scanner scan = new Scanner(System.in);
		String nameOfStudent = scan.next();
		if(findByName(students, nameOfStudent)==-1){
			System.out.println("The student you find are not in this list");
		}else{
		SVPoly sv = students.get(findByName(students,nameOfStudent));
		System.out.println("Student " + (findByName(students,nameOfStudent)+1) + " Name: " + sv.fullName + " Mark: " + sv.mark);
		}
		
		System.out.println("Type the full name of the student that you want to find and edit:");
		String name = scan.next();
		findAndEdit(students, name);
		
//		sortInMark(students);
		System.out.println("Sort the list of students in mark:");
		output(students);
		
	}

// Input
	public static void input(SVPoly student){
		Scanner scan = new Scanner(System.in);
		System.out.println("Type full name:");
		student.fullName = scan.next();
		System.out.println("Type mark:");
		student.mark = scan.nextDouble();
		
	}
// Output
	public static void output(ArrayList<SVPoly> students){
		for(SVPoly sv: students){
			int x = students.indexOf(sv);
			System.out.println("Student " + (x+1) + " Name: " + sv.fullName + " Mark: " + sv.mark);
		}
	}
	
//Output
	public static void outputByMark(ArrayList<SVPoly> students){
		Scanner scan = new Scanner(System.in);
		System.out.println("Print students list by mark from a to b:");
		System.out.println("Type a:");
		double a = scan.nextDouble();
		System.out.println("Type b:");
		double b = scan.nextDouble();
		for(SVPoly sv: students){
			if(sv.mark>=a && sv.mark<=b){
				System.out.println("Student " + (students.indexOf(sv)+1) + " Name: " + sv.fullName + " Mark: " + sv.mark);
			}
		}
	}

// Find student by fullName 
	public static int  findByName(ArrayList<SVPoly> students, String nameOfStudent){
		for(SVPoly sv : students){
			if(sv.fullName==nameOfStudent){
				return students.indexOf(sv);
			}
		}
		return  -1;
	}
// Find student and edit student's information
	public static void findAndEdit(ArrayList<SVPoly> students, String name){
		Scanner scan = new Scanner(System.in);
		for(SVPoly sv : students){
			if(sv.fullName == name){
				System.out.println("Type the name of student:");
				sv.fullName = scan.nextLine();
				System.out.println("Type the mark of student:");
				sv.mark = scan.nextDouble();
				System.out.println("The edited information of this student:");
				int x = students.indexOf(sv);
				System.out.println("Student " + (x+1) + "___ Name: "+ students.get(x).fullName + "___ Mark: " +students.get(x).mark);
			}
		}
	}
// sort in mark
	public static void sortInMark(ArrayList<SVPoly> students){
		for(SVPoly sv : students){
			for(SVPoly svv : students){
				if(sv.mark<svv.mark){
					SVPoly temp = sv;
					sv=svv;
					svv=temp;
				}
			}
		}
	
	}

}
