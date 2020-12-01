package io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import bean.Student;

public class ObjectStreamTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		objectInputStreamTest();
	}
    public static void objectStreamTest() throws IOException, ClassNotFoundException {
    	//把一个对象序列化
    	Student jyj = new Student(1,"jyj",21);
    	FileOutputStream fileOutputStream = new FileOutputStream(
    			new File("C:\\Users\\Administrator\\Desktop\\jyj.txt"));
    	ObjectOutputStream objectOutputStream = 
    			new ObjectOutputStream(fileOutputStream);
    	objectOutputStream.writeObject(jyj);
    }
    public static void objectInputStreamTest() throws IOException, ClassNotFoundException {
    	//把一个序列化对象写入java程序
    	FileInputStream fileInputStream = new FileInputStream(
    			new File("C:\\Users\\Administrator\\Desktop\\jyj.txt"));
    	ObjectInputStream objectInputStream = 
    			new ObjectInputStream(fileInputStream);
    	Student jyjBack = (Student) objectInputStream.readObject();
    	System.out.println(jyjBack);
    }
}
