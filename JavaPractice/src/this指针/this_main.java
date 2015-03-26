package this指针;

public class this_main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_product iphone = new this_product();
		iphone.increment().increment().increment().print();
		System.out.println(iphone.getI());
	}

}
