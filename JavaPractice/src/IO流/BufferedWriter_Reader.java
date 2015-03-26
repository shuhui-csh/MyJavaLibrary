/**
 * 
 */
package IO流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author CSH 按字符输入
 */
public class BufferedWriter_Reader {
	private static String fileName = "C:/Hello.text";
	private static String line;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 采用BufferedWriter类实现往文件里写入字符流数据
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
		out.write("你好，我在这    ！");
		out.newLine();
		out.write("我 还是很喜欢你啊Q");
		out.newLine();
		out.write("how are you @");
		out.close();
		// BufferedReader类用于从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		line = in.readLine();// 读取一行的内容
		while (line != null) {
			System.out.println(line);
			line = in.readLine();
		}
		in.close();
	}
}
