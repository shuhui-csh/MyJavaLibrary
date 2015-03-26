/**
 * 
 */
package 抽象继承_组合;

/**
 * @author CSH
 * 
 */
public class Stereo extends Product {
	// 扬声器数目
	protected int speaker;
	// 功率
	protected int watts;

	/**
	 * 
	 */
	public Stereo() {

	}

	/**
	 * @return the speaker
	 */
	public int getSpeaker() {
		return speaker;
	}

	/**
	 * @param speaker
	 *            the speaker to set
	 */
	public void setSpeaker(int speaker) {
		this.speaker = speaker;
	}

	/**
	 * @return the watts
	 */
	public int getWatts() {
		return watts;
	}

	/**
	 * @param watts
	 *            the watts to set
	 */
	public void setWatts(int watts) {
		this.watts = watts;
	}

	public Stereo(int b) {
		System.out.println("Stereo Constrctor.....");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see 抽象继承_组合.Product#ads()
	 */
	@Override
	public void ads() {
		System.out.println("Stereo is awfull");
	}

}
