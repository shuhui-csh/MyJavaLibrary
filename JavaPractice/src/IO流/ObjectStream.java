/**
 * 
 */
package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author CSH
 * 
 */
public class ObjectStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStream os = new ObjectStream();
		os.saveObj();
		os.readObj();
	}

	/**
	 * 存储对象数据到文件
	 */
	private void saveObj() {
		// product类必须实现序列化接口
		Product pro = new Product(1, "hoor", "phone", 999);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("obj.dat"));
			oos.writeObject(pro);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 从文件读取对象数据
	 */
	private void readObj() {
		Product prod;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"obj.dat"));
			prod = (Product) ois.readObject();
			ois.close();
			System.out.println("ID ：" + prod.ID);
			System.out.println("name ：" + prod.name);
			System.out.println("cate ：" + prod.categories);
			System.out.println("price ：" + prod.productPrice);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
