package BasicExercises;

import java.util.Scanner;

public class UclnBcnn {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = sn.nextInt();
		System.out.println("Nhap b: ");
		int b = sn.nextInt();
		if(a==0&&b==0){
			System.out.println("Undefined greatest common divisor and smallest common multiple");
		}else if(a!=0&&b!=0){
			System.out.println("Greatest common divisor: " + gCD(a, b));
			System.out.println("Smallest common multiple: " + (a*b)/gCD(a, b));
		}else if(a==0&&b!=0){
			System.out.println("Greatest common divisor " + Math.abs(b));
			System.out.println("Undefined smallest common multiple");
		}else{
			System.out.println("Greatest common divisor " + Math.abs(a));
			System.out.println("Undefined smallest common multiple");
		}
	}
	
// greatest common divisor
	public static int gCD(int a, int b){
		int suplus = -1;
		int x = Math.abs(a);
		int y = Math.abs(b);
		if(x%y==0){
			return y;
		}
		if(y%x==0){
			return x;
		}
		while(x!=y){
			if(x>y){
				suplus=x%y;
				y=suplus;
				x=y;
				
			}if(x<y){
				suplus=y%x;
				x=suplus;
				y=x;
			}
		}
		return x;
		}
}
