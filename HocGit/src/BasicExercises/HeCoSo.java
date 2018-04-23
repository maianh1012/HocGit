package BasicExercises;

import java.util.Scanner;

public class HeCoSo {
	public static void main(String[] args) {
//		Scanner sn = new Scanner(System.in);
//		System.out.println("Type a integer number: ");
//		int n = sn.nextInt();
//		System.out.println("Type a base you want change to: ");
//		int base = sn.nextInt();
//		System.out.println("The number in base(read from right to left):");
//		changeBase(n, base);
//		
		boolean is = true;
		System.out.println(is);
	}

//Change base
//principle
	/*
	 * chia so nguyen cho he co so can chuyen
	 * roi lay phan nguyen cua phep chia lai chia cho he co so can chuyen
	 * cho den khi so du bang 0
	 * viet so du theo thu tu tu sau den truoc ta dc he co so can chuyen o dang String
	 */
//method
	public static void changeBase(int n, int base){
		if(n<base){
			System.out.print(base);
		}else{
			int suplus = -1;
			while(n!=0){
				suplus = n%base;
				n = n/base;
				if(suplus>9){
					System.out.printf("%c",suplus+55);
				}else{
					System.out.print(suplus);
				}
			}
		}
	}
}
