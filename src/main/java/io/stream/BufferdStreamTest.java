package io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdStreamTest {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		bufferdStreamTest();
		long end = System.currentTimeMillis();
		System.out.println(end-start+"ms");	
	}
	public static void bufferdStreamTest() throws IOException {
		//用缓冲流输入输出文件
		byte[] bytes = new byte[50000];
		FileInputStream fileInputStream = 
				new FileInputStream(
						new File("C:\\Users\\Administrator\\Desktop\\杭州分区.jpg"));
		FileOutputStream fileOutputStream =
				new FileOutputStream(
						new File("C:\\Users\\Administrator\\Desktop\\杭州分区2.jpg"));
		BufferedInputStream bufferedInputStream = 
				new BufferedInputStream(fileInputStream);
		bufferedInputStream.read(bytes);
		BufferedOutputStream bufferedOutputStream = 
				new BufferedOutputStream(fileOutputStream);
		bufferedOutputStream.write(1);
	}
	
	public static void noBufferdStreamTest() throws IOException {
		byte[] bytes = new byte[50000];
		FileInputStream fileInputStream = 
				new FileInputStream(
						new File("C:\\Users\\Administrator\\Desktop\\杭州分区.jpg"));
		FileOutputStream fileOutputStream =
				new FileOutputStream(
						new File("C:\\Users\\Administrator\\Desktop\\杭州分区2.jpg"));
		fileInputStream.read(bytes);
		fileOutputStream.write(bytes);
	}
}
