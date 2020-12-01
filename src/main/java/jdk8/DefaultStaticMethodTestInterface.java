package jdk8;

public interface DefaultStaticMethodTestInterface {
	public void normalMethod();
	default void defaultMethod() {
		System.out.println("我是默认方法");
	}
	static void staticMethod() {
		System.out.println("我是静态方法");
	}
}
