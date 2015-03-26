package 继承关系;


public class SpeedBike extends Bike {

	public SpeedBike() {
		super();
		colornum = 12;
		presshorn();
		System.out.println("call SpeedBike constructor...");
		System.out.println("SpeedBike 中的 colornum 为" + colornum);
	}

	public void ride() {
		System.out.println("SpeedBike is riding the bike .");
	}

	public void speedup() {
		// 要用super显式调用父类的speedup()，否则会被子类的覆盖掉
		super.speedup();
		speed = speed + 10;
		System.out.println("so fast! my speed id:" + speed + " now");
	}

}
