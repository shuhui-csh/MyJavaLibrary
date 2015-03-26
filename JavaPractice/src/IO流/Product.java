/**
 * 
 */
package IO流;

import java.io.Serializable;

import javax.print.DocFlavor.STRING;

/**
 * @author CSH 对象序列化，该类必须实现Serializable接口
 */
public class Product implements Serializable {
	int ID;
	String name;
	String categories;
	double productPrice;

	/**
	 * 
	 */
	public Product(int id, String name, String cate, double price) {
		this.ID = id;
		this.name = name;
		this.categories = cate;
		this.productPrice = price;
	}

}
