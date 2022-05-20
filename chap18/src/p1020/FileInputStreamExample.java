package p1020;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\lkw_data\\java_data\\work09\\src\\work09\\PointClass.java");
			
			int data;
			while((data=fis.read())!=-1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace(); // 암튼 예외처리 랍니다~
		}
	}

}
