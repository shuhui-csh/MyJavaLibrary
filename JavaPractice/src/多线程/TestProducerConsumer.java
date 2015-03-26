/**
 * 
 */
package 多线程;

/**
 * @author CSH 2015-2-12上午11:57:42 测试生产者和消费者的同步问题
 */
public class TestProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Storage storage = new Storage();
		// 这里为创建一个实现一个runnable接口线程的方法
		Thread producer = new Thread(new Producer(storage));
		Thread consumer = new Thread(new Consumer(storage));
		producer.setName("生产者");
		consumer.setName("消费者");
		producer.setPriority(7);
		consumer.start();
		producer.start();

	}

}
