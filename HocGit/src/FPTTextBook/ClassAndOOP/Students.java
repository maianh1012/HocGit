package FPTTextBook.ClassAndOOP;

import java.util.Scanner;

public class Students {
	private String name;
	private float mark;
	
	public Students() {
	}
	
	public Students(String name, float mark){
		this.name = name;
		this.mark = mark;
	}
	
	public static void main(String[] args) {
		Students op1 = new Students();
		op1.inputStudents();
		op1.outputStudents();
		Students op2 = new Students("Nguyen", 6.5f);
		op2.outputStudents();
	}
	
// Input
	public void inputStudents(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Type full Name:");
		this.name = scan.nextLine();
		System.out.println("Type mark:");
		this.mark = scan.nextFloat();
	}
	
// Output
	public void outputStudents(){
		System.out.println(this.name + "____" + this.mark + "____" + this.rankAcademic());
	}
	
// Rank academic
	public String rankAcademic(){
		System.out.print("Academic Strength: ");
		if(this.mark >=0 && this.mark<5.0){
			//System.out.print("Yếu");
			return "Yếu";
		}else if(this.mark>=5 && this.mark<6.5){
			//System.out.print("Trung binh");
			return "Trung bình";
		}else if(this.mark>=6.5 && this.mark<8.0){
			//System.out.print("Khá");
			return "Khá";
		}else if(this.mark>=8.0 && this.mark<10){
			//System.out.print("Giỏi");
			return "Giỏi";
		}else{
			return "Điểm không hợp lệ";
		}
	}
}
