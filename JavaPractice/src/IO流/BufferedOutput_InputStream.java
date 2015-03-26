/**
 * 
 */
package IO流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author CSH 2015-2-11下午9:44:14 使用BufferedOutputStream实现缓冲的字节输出流
 */
public class BufferedOutput_InputStream {
	private static final String fileName = "binary.dat";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 创建DataOutputStream对象，BufferedOutputStream对象作为参数传递
			DataOutputStream dataout = new DataOutputStream(
					new BufferedOutputStream(new FileOutputStream(fileName)));
			dataout.writeInt(2);
			System.out.println(dataout.size() + "bytes have been written");
			dataout.writeDouble(21.2);
			System.out.println(dataout.size() + "bytes have been written");
			dataout.writeChars("那你好吗？");
			System.out.println(dataout.size() + "bytes have been written");
			dataout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			DataInputStream datain = new DataInputStream(
					new BufferedInputStream(new FileInputStream(fileName)));
			System.out.println(datain.readInt());
			System.out.println(datain.readDouble());
			//最后这里如何读取chars?
			System.out.println(datain.readChar());
			datain.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
