/**
 * 
 */
package 多线程;

/**
 * @author CSH 2015-2-12上午11:20:18
 */
public class Test_EThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new E_Thread("树辉").start();
		new E_Thread("林小").start();

	}

}
