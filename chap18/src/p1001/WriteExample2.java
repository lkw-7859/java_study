package p1001;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("c:/Temp/test.txt");
		byte[] data = "안녕하세요 자바를 배우고 있는 학생입니다.".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}

}
