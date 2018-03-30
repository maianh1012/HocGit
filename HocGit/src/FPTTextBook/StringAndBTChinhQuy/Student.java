package FPTTextBook.StringAndBTChinhQuy;

import java.util.ArrayList;
// ??????????????????????????????

public class Student {
	public static void main(String[] args) {
		ArrayList<String> fullName = new ArrayList<>();
		fullName.add("Nguyễn Thị Hoa");
		fullName.add("Nguyễn Thị Mai");
		fullName.add("Phạm Mạnh Tuấn");
		fullName.add("Lê Mỹ Hoa");
		fullName.add("Ngô Mỹ Linh");
		fullName.add("Hoàng Văn Tuấn");
		fullName.add("Ngô Tuấn");
		for(int i=0; i<fullName.size(); i++){
			if((fullName.get(i).endsWith("Tuấn")) || (fullName.get(i).startsWith("Nguyễn"))){
				fullName.get(i).toUpperCase();
				System.out.println(fullName.get(i));
			}
			if(fullName.get(i).contains("Mỹ")){
				System.out.println(fullName.get(i).substring(fullName.get(i).lastIndexOf(" ") +1));
			}
		}
	}
}
