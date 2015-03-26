/**
 * 
 */
package 继承关系;

/**
 * @author CSH
 * 
 */
public class BikeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// SpeedBike向上转型为bike,后面的调用方法即为多态了
		Bike sbike = new SpeedBike();
		sbike.presshorn();
		sbike.ride();
		sbike.speedup();
	}

}
