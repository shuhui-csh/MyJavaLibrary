package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author CSH 2015-2-13上午11:41:32
 *         客户端的端口号一定要为Server监听的端口号，ip地址也要为Server的地址，两者都从参数args中取得
 */
public class PingClient {

	private static String receive;

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 存储每一次往返的rtt，用于最后的统计
		Long[] rtt = new Long[10];
		// 模拟发送10条请求
		for (int i = 1; i <= 10; i++) {
			// 时间戳格式
			SimpleDateFormat sdf = new SimpleDateFormat(
					"yyyy-MM-dd hh:mm:ss.SS");
			// 模拟用的每次发送的请求数据
			String content = "head: request" + i + "\n"
					+ "playload: PingUDP SequenceNumber:" + i + "TimeStamp:"
					+ sdf.format(new Date()) + "\n";

			/** 1、创建DatagramSocket */
			// 生成client端的socket
			DatagramSocket clientSocket = new DatagramSocket();

			/** 2、发送客户请求到服务器 */
			// 从命令行获得server ip地址
			InetAddress IPAddress = InetAddress.getByName("localhost");
			// 从命令行获得server port
			int port = Integer.parseInt("6688");
			// 用于发送数据的byte数组
			byte[] sendData = new byte[128];
			// 用于接收数据的byte数组
			byte[] receiveData = new byte[128];
			// 将请求数据转换到byte数组
			sendData = content.getBytes();
			// 创建客户方的DatagramPacket对象，用于发送消息
			DatagramPacket sendPacket = new DatagramPacket(sendData,
					sendData.length, IPAddress, port);
			// 记录发送前时间
			Date sendTime = new Date();
			// 发送到server端
			clientSocket.send(sendPacket);
			// System.out.println("我有没有发出去了数据？？？");
			/** 3、接收服务器回答 */
			// 创建DatagramPacket对象，用于接收消息
			DatagramPacket receivePacket = new DatagramPacket(receiveData,
					receiveData.length);
			// System.out.println("我在等待数据返回");
			// 接收从server返回的数据包
			clientSocket.receive(receivePacket);
			// System.out.println("终于等到了数据返回了！！！");
			// 记录接收后的时间
			Date receiveTime = new Date();
			// 从数据包中读取数据，并把byte数组转换成String
			receive = new String(receivePacket.getData());
			// 计算rtt
			rtt[i - 1] = receiveTime.getTime() - sendTime.getTime();
			if (receive.startsWith("请求超时\n")) {

			} else {
				// 显示rtt
				System.out.println("rtt:" + rtt[i - 1]);
			}
			// 显示从server返回的数据
			System.out.println(receive);
			// 关闭socket
			clientSocket.close();
		}
		;

		// 统计出平均rtt,最大rtt和最小rtt
		long sumRtt = 0;
		long maxRtt = 0;
		long minRtt = rtt[0];
		// 冒泡排序法
		for (int i = 0; i < 10; i++) {
			if (rtt[i] > maxRtt) {
				maxRtt = rtt[i];
			}
			if (rtt[i] < minRtt) {
				minRtt = rtt[i];
			}
			sumRtt += rtt[i];
		}
		System.out.println("average rtt: " + sumRtt / 10 + " millisecond");
		System.out.println("max rtt: " + maxRtt);
		System.out.println("min rtt: " + minRtt);
	}

}
