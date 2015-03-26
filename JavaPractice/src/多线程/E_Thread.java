/**
 * 
 */
package 多线程;

/**
 * @author CSH 2015-2-12上午11:11:31
 */
public class E_Thread extends Thread {

	/**
	 * 私有化默认的构造方法，防止其他对象通过默认的构造方法创建对象
	 */
	private E_Thread() {
	}

	/**
	 * @param arg0
	 *            线程的名称
	 */
	public E_Thread(String arg0) {
		super(arg0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());// 取得线程的名称
			try {
				sleep((long) (Math.random() * 1000));// 线程休眠0~1秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
