package sequence;

public class SequenceTest extends SequenceTestFather{
	{
		System.out.println("子匿名代码块");
	}
	static {
		System.out.println("子静态");
	}
	public SequenceTest() {
		System.out.println("子构造");
	}
}
