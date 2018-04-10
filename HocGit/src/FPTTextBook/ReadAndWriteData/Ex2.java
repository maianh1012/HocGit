package FPTTextBook.ReadAndWriteData;

import java.io.*;

public class Ex2 {

	public static void main(String[] args)throws IOException {
		FileInputStream fis = new FileInputStream("filedata.dat");
		DataInputStream dis = new DataInputStream(fis);
		int item = dis.readInt();
		for(int i=0; i<=item; i++){
			int n= dis.readInt();
			System.out.print(n +" ");
		}
		System.out.println();
		System.out.println(dis.readUTF());
		System.out.println(dis.readDouble());
		dis.close();
	}

}
