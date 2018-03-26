package BasicExercises;
import java.util.Scanner;

public class LietKeSoThuanNghich {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cac so thuan nghich co 6 chu so: ");
		lietKeSTN();
	}
// kiem tra so thuan nghich	
	public static boolean ktSoThuanNghich(int x){
		int a = 0;
		int y=x;
		while(y!=0){
			a = a*10+y%10;
			y=y/10;
		}
		if(x==a){
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
