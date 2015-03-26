/**
 * 
 */
package 多线程;

/**
 * @author CSH 2015-2-12上午11:28:57
 */
public class Product {
	int id;
	String name;

	/**
	 * 
	 */
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}
