package BasicExercises;

import java.util.Scanner;

public class LietKeSoThuanNghich {

	public static void main(String[] args) {
		Scanner scan = new Scanner(system.in);
		
	}
// kiem tra so thuan nghich	
	public static boolean ktSoThuanNghich(int x){
		String check1 = "" + x;
		String check2 = x + "";
		if(check1==check2){
			return true;
		}else{
			return false;
		}
	}
// Liet ke so thuan nghich
	public static void lietKeSTN(){
		for(int i=100000; i<=999999; i++){
			if(ktSoThuanNghich(i)){
				System.out.println(i);
			}
		}
	}
	
}
