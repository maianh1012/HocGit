package FPTTextBook.ArraysList;

import java.util.ArrayList;

public class RealNumbersArrays {

	public static void main(String[] args) {
		ArrayList<Double> realNumbers = new ArrayList<Double>();
		realNumbers.add(7.8);
		realNumbers.add(8.2);
		realNumbers.add(6.3);
		realNumbers.add(7.9);
		realNumbers.add(9.7);
		double sum = 0;
		for(double x: realNumbers){
			sum = sum + x;
		}
		System.out.println("The sum of the elements: " + sum);
	}
}
		
		
		