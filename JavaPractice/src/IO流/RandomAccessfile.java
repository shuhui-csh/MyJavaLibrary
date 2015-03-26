/**
 * 
 */
package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author CSH 下午9:16:17
 */
public class RandomAccessfile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo = new FileOutputStream("RAFile.dat");
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e + "无法创建文件");
		}
		try {
			// 生成随机文件对象
			RandomAccessFile randf = new RandomAccessFile("RAFile.dat", "rw");
			int[] date = { 12, 32, 56, 1, 2, 6, 589, 8, 9 };
			System.out.print("写入的数据为：");
			for (int i = 0; i < date.length; i++) {
				System.out.print(date[i] + ",");
				randf.writeInt(date[i]);
			}
			System.out.println();
			// 从文件里读取数据
			System.out.print("读出的数据为：");
			for (int i = date.length - 1; i >= 0; i--) {
				// 将指针指向文件末，反方向依次读取数据
				randf.seek(i * 4L);
				System.out.print(randf.readInt() + ",");
			}
			System.out.println();
			randf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
