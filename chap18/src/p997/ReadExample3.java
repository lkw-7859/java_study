package p997;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 5, 3);
		
		for(int i=0;i<readBytes.length;i++) 
			System.out.print((char)readBytes[i]);
		
		is.close();
	}
}
