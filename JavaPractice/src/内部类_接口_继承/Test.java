/**
 * 
 */
package 内部类_接口_继承;

/**
 * @author CSH
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WriteStory w = new WriteStory();
		Paper pa = w.writeDown("你好吗？我很好，想念是会呼吸的痛");
		Pencil pe = w.pen();

	}

}
