package this指针;
public class this_product {
	private int ID;
	private String name;
	private int i = 0;

	/**
	 * @param iD
	 * @param name
	 */
	public this_product(int iD, String name) {
		super();
		// 1、this指针指向了调用此构造方法的对象
		this.ID = iD;
		this.name = name;
	}

	/**
	 * @author CSH
	 * 3、this指针调用带参数的构造方法
	 */
	public this_product() {
		this(1, "iphone");
	}

	public this_product increment() {
		i++;
		// 2、返回this指针，如同返回调用increment方法的this_product对象
		return this;
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("i = " + i);
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	
}
