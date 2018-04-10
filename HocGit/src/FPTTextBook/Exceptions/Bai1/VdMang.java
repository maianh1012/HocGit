package FPTTextBook.Exceptions.Bai1;

import java.util.Scanner;

public class VdMang {

	public static void main(String[] args) {
		int []mang = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the number of elements you want to input in Array: ");
		int n = scan.nextInt();
		
		try {
			
			for(int i=0; i< n; i++){
				System.out.println("Enter the value of the element " + (i+1) + ":");
				mang[i] =  scan.nextInt();
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Vuot ngoai chi so mang: " + e);
		}
		System.out.println("Array: ");
		for(int i=0; i<mang.length; i++){
			System.out.println("The element " + (i+1) + ": " + mang[i]);
		}
		
	}

}
