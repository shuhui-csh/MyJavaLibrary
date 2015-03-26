package 继承关系;

public class Bike {
	protected int colornum;
	protected int brand;
	protected int speed;

	protected Bike() {
		System.out.println("call Bike constructor");
	}

	public void speedup() {
		speed = 0;
		System.out.println("too low .........");
	}

	public void presshorn() {
		System.out.println("beep.........");
	}

	protected void ride() {
		System.out.println("this is the bike's riding");
	}
}
