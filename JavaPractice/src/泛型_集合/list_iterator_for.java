/**
 * 
 */
package 泛型_集合;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author CSH
 * 
 */
public class list_iterator_for {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 类型为Object类型，可以存储不同类型的数据
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(new Integer(1));
		al.add(new String("你好吗"));
		al.add(new Double(2.36));
		al.add(new Integer(3));
		// 用迭代器遍历集合
		Iterator<Object> it = al.iterator();
		while (it.hasNext()) {// hasNext()判断是否还有元素
			System.out.println(it.next());// 打印输出下一个元素
		}
		// 用增强for循环迭代出每个元素
		for (Object s : al) {
			System.out.println(s);
		}
	}

}
