public class Enum {
	/* 枚举类型变量的使用 */
	public enum week {
		Sun, Mon, Tue, Wwd, Thu, Fri, Sat
	}

	public static void main(String[] args) {
		week day1 = week.Mon;
		week day2 = week.Thu;
		// 申明数组的时候即完成初始化
		int[] a = { 1, 2, 3 };
		for (int b : a) {
			System.out.println(b);
		}
		// 先申明数组，再进行赋值，这里有一个问题，打印出来的居然只有5个0
		int[] arr = new int[10];
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i++;
			System.out.println(arr[i]);
		}
		System.out.println(arr.toString());
		// ordinal()方法得出enum元素的排列
		int diff = day2.ordinal() - day1.ordinal();
		System.out.println(day1);
		System.out.println(day2);
		System.out.println("day1 order is " + day1.ordinal());
		System.out.println("day2 order is " + day2.ordinal());
		System.out.println("day diff: " + diff);
		for (week day : week.values()) {
			System.out.println(day);
		}
	}
}
