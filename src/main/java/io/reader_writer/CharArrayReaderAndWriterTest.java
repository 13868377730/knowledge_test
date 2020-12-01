package io.reader_writer;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayReaderAndWriterTest {
	public static void main(String[] args) throws IOException {
		charArrayReaderAndWriterTest();
	}
	public static void charArrayReaderAndWriterTest() throws IOException {
		//利用reader把一个char数组的数据放入另一个char数组
		char[] chars = "啊啊啊啊啊".toCharArray();
		char[] chars2 = new char[1024];
		CharArrayReader charArrayReader = new CharArrayReader(chars);
		charArrayReader.read(chars2);

		CharArrayWriter charArrayWriter = new CharArrayWriter();
		charArrayWriter.write(chars2);
		char[] chars3 = charArrayWriter.toCharArray();
		System.out.println(chars3);
	}
}
