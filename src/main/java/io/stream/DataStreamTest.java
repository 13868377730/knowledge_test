package io.stream;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) throws IOException {
		dataStreamTest();
	}
	public static void dataStreamTest() throws IOException {
		byte[] bytes = "hello".getBytes();
		ByteArrayInputStream byteArrayInputStream = 
				new ByteArrayInputStream(bytes);
		DataInputStream dataInputStream = 
				new DataInputStream(byteArrayInputStream);
		String newString = dataInputStream.readLine();
		System.out.println(newString);
	}
}
