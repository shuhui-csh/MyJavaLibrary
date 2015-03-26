package 抽象继承_组合;

/**
 * @author CSH
 * 
 */
public class HomeTheather {
	// 类的组合,main方法是static方法，之只能引用static数据或另外的static方法
	private static Product lenovo;
	private static Product sharp;
	private static Laptop apple;

	public HomeTheather(int i) {
		lenovo = new Computer(i);
		sharp = new Stereo(i + 2);
		apple = new Laptop(i + 3);
	}

	public static void main(String[] args) {
		HomeTheather mytheater = new HomeTheather(3);
		lenovo.ID = 123;
		lenovo.name = "csh_computer";
		lenovo.categories = "laptop_computer";
		System.out.println(lenovo.getName());
		System.out.println(lenovo.getCategories());
		lenovo.ads();

		apple.ID = 456;
		apple.name = "csh_laptop";
		apple.weight = 20.3;
		apple.thickness = 1.3;
		System.out.println(apple.getName());
		System.out.println(apple.getWeight());
		System.out.println(apple.getThickness());
		apple.ads();
	}
}
