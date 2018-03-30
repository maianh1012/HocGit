package FPTTextBook.ArraysList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question {

	public static void main(String[] args) {
		ArrayList<String> question = new ArrayList<String>();
		question.add("What's your name?");
		question.add("What's your favorite singer?");
		question.add("How do you feel?");
		question.add("Where 're you from?");
		question.add("What's your job?");
		Collections.shuffle(question);
		for(String x: question){
			System.out.println(x);
		}
	}

}
