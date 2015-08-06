package Builder;

/**
 * @author CSH 2015-8-6下午10:46:09 食品营养成分类，包含多个可选的营养标签，采用构建器（Builder）模式来实例化，
 *         以后也可以动态地添加参数属性，而不需要修改构造参数
 */
public class NutritionFacts {
	// 参数列表
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	/**
	 * @param builders
	 */
	public NutritionFacts(Builders builders) {
		// TODO Auto-generated constructor stub
		servingSize = builders.servingSize;
		servings = builders.servings;
		calories = builders.calories;
		fat = builders.fat;
		sodium = builders.sodium;
		carbohydrate = builders.carbohydrate;
	}

	public static class Builders implements Builder<NutritionFacts> {
		// 必须的参数
		private final int servingSize;
		private final int servings;

		// 可选的参数，并且可进行默认赋值
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;

		/**
		 * @param servingSize
		 * @param servings
		 */
		public Builders(int servingSize, int servings) {
			super();
			this.servingSize = servingSize;
			this.servings = servings;
		}

		/**
		 * @param cal
		 * @return 赋值后返回Builders对象本身
		 */
		public Builders calories(int cal) {
			calories = cal;
			return this;
		}

		/**
		 * @param fa
		 * @return 赋值后返回Builders对象本身
		 */
		public Builders fat(int fa) {
			fat = fa;
			return this;
		}

		/**
		 * @param sod
		 * @return 赋值后返回Builders对象本身
		 */
		public Builders sodium(int sod) {
			sodium = sod;
			return this;
		}

		/**
		 * @param carbo
		 * @return 赋值后返回Builders对象本身
		 */
		public Builders carbohydrate(int carbo) {
			carbohydrate = carbo;
			return this;
		}

		@Override
		public NutritionFacts build() {
			// TODO Auto-generated method stub
			return new NutritionFacts(this);
		}

	}

	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings="
				+ servings + ", calories=" + calories + ", fat=" + fat
				+ ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}

}
