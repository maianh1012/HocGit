package FPTTextBook.ReadAndWriteData;

import java.io.*;

public class Ex1 {
// Read data, Data stream ouput
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("filedata.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		final int NUMBER = 5;
		dos.writeInt(NUMBER);
		for(int i=0; i<=NUMBER; i++){
			dos.writeInt(i);
		}
		dos.writeUTF("Hello!");
		dos.writeDouble(100.1);
		dos.flush();
		dos.close();
	}
}
