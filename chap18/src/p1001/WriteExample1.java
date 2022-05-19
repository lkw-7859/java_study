package p1001;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/temp/test.txt");
		byte[] data = "ABC".getBytes();
		
		for(int i=0;i<data.length;i++) {
			os.write(data[i]);
			System.out.print((char)data[i]);
		}
		os.flush();
		os.close();
	}
}
