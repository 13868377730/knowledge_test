package jdk8;

public class DefaultStaticMethodTestClass implements DefaultStaticMethodTestInterface{

	@Override
	public void normalMethod() {
		System.out.println("我是普通接口方法的实现");
	}
	
	public static void main(String[] args) {
		DefaultStaticMethodTestInterface defaultStaticMethodTestClass =
				new DefaultStaticMethodTestClass();
		DefaultStaticMethodTestInterface.staticMethod();
		defaultStaticMethodTestClass.defaultMethod();
	}
}
