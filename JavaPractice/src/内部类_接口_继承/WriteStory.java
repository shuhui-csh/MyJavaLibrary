/**
 * 
 */
package 内部类_接口_继承;

/**
 * @author CSH
 * 
 */
public class WriteStory {
	private class MyPencil extends Pencil {
		private int i = 5;

		/**
		 * 
		 */
		public MyPencil() {
			super();
			System.out.println(i);
		}

		@Override
		public int value() {
			return i;
		}

	}

	protected class MyPaper implements Paper {
		private String line;

		private MyPaper(String str) {
			line = str;
			System.out.println(line);
		}

		@Override
		public String mark() {
			return line;
		}

	}

	public Paper writeDown(String s) {
		// 方法返回子类MyPaper对象，向上转型为接口类型的Paper
		return new MyPaper(s);
	}

	public Pencil pen() {
		// 方法返回子类MyPencil对象，向上转型为父类Pencil
		return new MyPencil();

	}
}
