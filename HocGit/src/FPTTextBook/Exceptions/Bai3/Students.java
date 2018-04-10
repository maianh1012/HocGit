package FPTTextBook.Exceptions.Bai3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Students {
	private int iRollNo;
	private String fullName;
	private double mark;
	private String acacdemicStr;
	private static final int IROLLNO = 0;
	private static final String FULLNAME ="No name yet";
	private static final int MARK = 0;
	private static String ACADEMICSTR = "Not rated academic strength";
	
	public Students(int iRollNo, String fullName, double mark, String academicStr){
		this.iRollNo = iRollNo;
		this.fullName = fullName;
		this.mark = mark;
		this.acacdemicStr = academicStr;
	}
	
	public Students(){
		this(IROLLNO,FULLNAME,MARK,ACADEMICSTR);
	}
	

	public int getiRollNo() {
		return iRollNo;
	}

	public void setiRollNo(int iRollNo) {
		this.iRollNo = iRollNo;
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

	public String getAcacdemicStr() {
		return acacdemicStr;
	}

	public void setAcacdemicStr(String acacdemicStr) {
		this.acacdemicStr = acacdemicStr;
	}
	
	public void setAcademicStr(){
		if(mark>=8){
			acacdemicStr = "A";
		}else if(mark>=7){
			acacdemicStr = "B";
		}else if(mark>=5){
			acacdemicStr = "C";
		}else{
			acacdemicStr = "D";
		}
	}
	
	@Override
	
	public String toString(){
		return iRollNo + "\t" + fullName + "\t" + mark + "\t" + acacdemicStr + "\n";
	}
	
	public void input()throws InputMismatchException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student's ID, full name, mark:");
		int iRollNo = scan.nextInt();
		this.setiRollNo(iRollNo);
		String fullName = scan.next();
		this.setFullName(fullName);;
		double mark = scan.nextDouble();
		this.setMark(mark);
	}
	
	public static void main(String[] args) {
		Students s = new Students();
		System.out.println("Student: " + s);
		try{
			s.input();
			s.setAcademicStr();
		}catch(InputMismatchException e){
			System.out.println("You entered wrong data type, enter data again:");
			s.input();
			s.setAcademicStr();
			System.out.println("Student after input, student:  " + s);
		}
	}
	
}
