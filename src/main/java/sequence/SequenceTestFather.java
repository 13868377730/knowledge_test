package sequence;

public class SequenceTestFather {
	static {
		System.out.println("父静态");
	}
	public SequenceTestFather() {
		System.out.println("父构造");
	}
	{
		System.out.println("父匿名代码块");
	}
}
