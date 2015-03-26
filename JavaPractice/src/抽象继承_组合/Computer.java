/**
 * 
 */
package 抽象继承_组合;

/**
 * @author CSH
 * 
 */
public class Computer extends Product {
	protected int memory;
	protected String ProcessorName;

	/**
	 * 默认构造方法
	 */
	public Computer() {

	}

	public Computer(int a) {
		System.out.println("Computer constructor....");
	}

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory
	 *            the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	/**
	 * @return the processorName
	 */
	public String getProcessorName() {
		return ProcessorName;
	}

	/**
	 * @param processorName
	 *            the processorName to set
	 */
	public void setProcessorName(String processorName) {
		ProcessorName = processorName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象继承_组合.Product#ads()
	 */
	@Override
	public void ads() {
		System.out.println("the computer is the best you've seen!");
	}

}
