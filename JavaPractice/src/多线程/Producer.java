/**
 * 
 */
package 多线程;

/**
 * @author CSH 2015-2-12上午11:32:47 生产者线程，用于添加产品到仓库
 */
public class Producer implements Runnable {
	private Storage storage;

	/**
	 * 
	 */
	public Producer(Storage storage) {
		this.storage = storage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			Product product = new Product(i, "hoor");
			storage.push(product);
			// try {
			// wait((int) (Math.random() * 1000));// 休眠0~100毫秒
			// } catch (InterruptedException e) {
			// e.printStackTrace();
			// }
		}

	}

}
