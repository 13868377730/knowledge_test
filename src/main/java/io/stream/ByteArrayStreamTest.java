package io.stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayStreamTest {
	public static void main(String[] args) throws IOException {
		byteArrayStreamTest();
	}
	public static void byteArrayStreamTest() throws IOException {
		byte[] bytes = new byte[1000];
		ByteArrayInputStream byteArrayInputStream = 
				new ByteArrayInputStream("hello".getBytes());
		byteArrayInputStream.read(bytes);
		System.out.println(byteArrayInputStream);
	}
}
