/**
 * 
 */
package 多线程;

/**
 * @author CSH 2015-2-12上午11:38:05 消费者线程，用于取出商品
 */
public class Consumer implements Runnable {
	private Storage storage;

	/**
	 * 
	 */
	public Consumer(Storage storage) {
		this.storage = storage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			storage.pop();
		}

	}

}
