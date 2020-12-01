package reflect;

import java.lang.reflect.Modifier;
import java.sql.DriverManager;

import bean.Student;

public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName("test.bean.Student");
		System.out.println(clazz.getModifiers());
	}
}
