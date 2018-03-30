package FPTTextBook.ArraysAndLoops;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		System.out.println("Type the list of students: ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the number of the students:");
		int n = scan.nextInt();
		while(!(n>0)){
			System.out.println("The number of the students is greater than 0, type again:");
			n = scan.nextInt();
		}
		String[] students = new String[n];
		float[] marks = new float[n];
		inputStudents(students, marks);
		//System.out.println("Sort student alphabetically:");
		sortInMarks(students, marks);
		System.out.println("Sort students in marks:");
		outputStudents(students, marks);
	}

// Input
	public static void inputStudents(String students[], float marks[]){
		Scanner scan = new Scanner(System.in);
		for(int i=0; i< students.length; i++){
			System.out.println("Type the name of student "+ (i+1) + " :");
			students[i] = scan.nextLine();
			System.out.println("Type mark of student " + (i+1) + " :");
			marks[i] = scan.nextFloat();
			scan.nextLine();
		}
	}

// sort in marks
	public static void sortInMarks(String students[], float marks[]){
		for(int i=0; i< marks.length; i++){
			for(int j=i+1; j<marks.length; j++){
				
				
				if(marks[i]>marks[j]){
					float temp= marks[i];
					marks[i]= marks[j];
					marks[j]=temp;
					String sTemp = students[i];
					students[i]=students[j];
					students[j]=sTemp;
				}
			}
		}
	}

//output
	public static void outputStudents(String students[], float marks[]){
		for(int i=0; i<students.length; i++){
			System.out.println(students[i] + "______" + marks[i]);
		}
	}
}
