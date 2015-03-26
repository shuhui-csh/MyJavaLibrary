/**
 * 
 */
package 多线程;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author CSH 2015-2-12上午11:34:09 仓库类，用于模拟存储产品
 */
public class Storage {
	private Product[] products = new Product[10];
	private static int top = 0;
	Lock mylock = new ReentrantLock();// 定义一个lock
	Condition empty = mylock.newCondition();// 定义一个Condition对象empty;
	Condition full = mylock.newCondition();// 定义一个Condition对象full;

	/**
	 * @param product
	 *            此方法表示生产者往仓库里添加产品 ,手动上锁
	 */
	public void push(Product product) {
		mylock.lock();// 获取锁
		// 加入while这段代码和notifyAll();唤醒等待线程可实现线程间同步通信
		try {
			while (top == products.length) {
				full.await();// 仓库已满，等待
			}
			products[top++] = product;
			System.out.println(Thread.currentThread().getName() + " cereats "
					+ product);
			empty.signal();// 唤醒等待consumer线程
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			mylock.unlock();// 释放锁
		}

	}

	/**
	 * 消费者从仓库取出产品，采用手动上锁方法
	 */
	public void pop() {
		mylock.lock();// 获得锁
		try {
			while (top == 0) {
				empty.await();// 仓库为空，等待
			}
			--top;
			Product p = new Product(products[top].id, products[top].name);
			products[top] = null;
			System.out.println(Thread.currentThread().getName() + " buy " + p);
			full.signal();// 唤醒等待producer线程
		} catch (Exception e) {

		} finally {
			mylock.unlock();// 释放锁
		}
	}

	// /**
	// * @param product
	// * 此方法表示生产者往仓库里添加产品 synchronized表示同步方法
	// */
	// public synchronized void push(Product product) {
	// // 加入while这段代码和notifyAll();唤醒等待线程可实现线程间同步通信
	// while (top == products.length) {
	// try {
	// wait();// 仓库已满，等待
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }
	// products[top++] = product;
	// System.out.println(Thread.currentThread().getName() + " cereats "
	// + product);
	//
	// notifyAll();// 唤醒等待线程
	//
	// }
	//
	// /**
	// * 消费者从仓库取出产品,同步方法，即在方法前添加synchronized关键字，还有一种同步语句也可以实现相同功能
	// */
	// public synchronized void pop() {
	// while (top == 0) {
	// try {
	// wait();// 仓库为空，等待
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }
	// --top;
	// Product p = new Product(products[top].id, products[top].name);
	// products[top] = null;
	// System.out.println(Thread.currentThread().getName() + " buy " + p);
	//
	// notifyAll();// 唤醒等待线程
	// }

	// /**
	// * @param product
	// * 此方法表示生产者往仓库里添加产品 synchronized表示同步方法,同步语句
	// */
	// public void push(Product product) {
	// synchronized (this) {
	// products[top++] = product;
	// System.out.println(Thread.currentThread().getName() + " cereats "
	// + product);
	// }
	// }
	//
	// /**
	// * 消费者从仓库取出产品,同步方法，即在方法前添加synchronized关键字，同步语句也可以实现相同功能,如下
	// */
	// public void pop() {
	// synchronized (this) {
	// --top;
	// Product p = new Product(products[top].id, products[top].name);
	// products[top] = null;
	// System.out.println(Thread.currentThread().getName() + " buy " + p);
	// }
	//
	// }

}
