package io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) throws IOException {
		fileStreamTest();
	}
	public static void fileStreamTest() throws IOException {
		byte[] bytes = new byte[50000];
		File file = new File("C:\\Users\\Administrator\\Desktop\\杭州分区.jpg");
		File file2 = new File("C:\\Users\\Administrator\\Desktop\\杭州分区2.jpg");
		FileInputStream fileInputStream = new FileInputStream(file);
		fileInputStream.read(bytes);
		FileOutputStream fileOutputStream = new FileOutputStream(file2);
		fileOutputStream.write(bytes);
		fileInputStream.close();
		fileOutputStream.close();
	}
}
