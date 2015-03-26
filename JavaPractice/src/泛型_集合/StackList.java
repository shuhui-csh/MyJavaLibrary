/**
 * 
 */
package 泛型_集合;

import java.util.LinkedList;

/**
 * @author CSH
 * 
 */
public class StackList<E> {
	// 申明一个具有泛型参数的类
	// 创建一个LinkedList,具体放置元素类型用E代替
	private LinkedList<E> list = new LinkedList<E>();

	public void push(E e) {
		list.addFirst(e);// 压栈
	}

	public E top() {
		return list.getFirst();// 取出栈顶元素
	}

	public E pop() {
		return list.removeFirst();// 出栈
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return list.toString();
	}

	public static void main(String[] args) {
		// 实例化对象，并把实参传递给泛型类，指定具体放置元素类型为String
		StackList<String> sl = new StackList<String>();
		for (int i = 0; i < 5; i++) {
			sl.push(String.valueOf(i));
		}
		System.out.println("sl = " + sl);
	}

}
