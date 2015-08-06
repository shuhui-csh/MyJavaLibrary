/**
 * 
 */
package Builder;

/**
 * @author CSH 2015-8-6下午11:22:22
 */
public class TestBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NutritionFacts nur = new NutritionFacts.Builders(240, 8).calories(100)
				.sodium(35).carbohydrate(24).build();

		System.out.println(nur.toString());
	}

}
