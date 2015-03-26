package 类访问控制;

/**
 * 类的修饰符只有public和默认（包），
 * 包的访问控制只限于同一包内的访问 
 * protected只可被同一类及其子类的实例对象访问
 * */
public class Baby {

	/**
	 * 私有的默认构造方法
	 */
	private Baby() {
		System.out.println("Baby constructor");
	}

	/**
	 * 通过公有的静态方法调用私有的默认构造方法创建对象
	 */
	public static Baby babyBorn() {
		// 私有方法只能在同类里被调用
		return new Baby();

	}
}
