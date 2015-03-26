package 类访问控制;

public class Parent {

	/**
	 * @author CSH
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Baby baby = new Baby();无法使用私有的默认构造方法创建baby对象
		Baby baby = Baby.babyBorn();

	}

}
