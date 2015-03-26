/**
 * 
 */
package 抽象继承_组合;

/**
 * @author CSH
 * 
 */
public class Laptop extends Computer {
	protected double thickness;
	protected double weight;

	/**
	 * 
	 */
	public Laptop() {

	}

	/**
	 * @param a
	 */
	public Laptop(int a) {
		super(a);
		System.out.println("Laptop Consructer....");
	}

	/**
	 * @return the thickness
	 */
	public double getThickness() {
		return thickness;
	}

	/**
	 * @param thickness
	 *            the thickness to set
	 */
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象继承_组合.Computer#ads()
	 */
	@Override
	public void ads() {
		// 显式调用了父类被覆盖了的ads()方法，这样就会先调用父类的ads()方法，再执行自己的
		super.ads();
		System.out.println("the laptop is the best choise!");
	}

}
