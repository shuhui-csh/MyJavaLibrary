package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class PingServer {

	private static int port;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("网络编程 Server Started");
		// 从命令行获得server工作监听的 port
		port = Integer.parseInt("6688");
		new ServerThread().start();
	}

	/**
	 * @author CSH 2015-2-13上午11:36:36 内部类，继承线程用于处理连续发过来的请求
	 */
	public static class ServerThread extends Thread {

		public DatagramSocket serverSocket;

		/**
		 * @param arg0
		 */
		public ServerThread() {
			super("MyServerThread");// 调用超类的Thread的构造方法初始化线程，取名MyServerThread
			try {
				// port为server工作时监听的端口号
				serverSocket = new DatagramSocket(port);
				// System.out.println("ServerThread我有没有被创建？");
				System.out
						.println("Server监听的端口：" + serverSocket.getLocalPort());
				System.out.println("Server监听的ip地址："
						+ serverSocket.getLocalSocketAddress());
			} catch (SocketException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			if (serverSocket == null) {
				return;
			} else {
				// 如果不为空，无限循环监听请求
				while (true) {
					// 用于接收数据的byte数组
					byte[] receiveData = new byte[128];
					// 用于发送数据的byte数组
					byte[] sendData = new byte[128];

					/** 1、监听部分 */
					// 创建DatagramPacket对象接收信息
					DatagramPacket receivePacket = new DatagramPacket(
							receiveData, receiveData.length);
					// 从Socket接收一个Datagram
					try {
						serverSocket.receive(receivePacket);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// 将数据从byte数组轮换回String
					String content = new String(receivePacket.getData());
					// 获得client端的ip
					InetAddress IPAddress = receivePacket.getAddress();
					// 获得client端的port
					int port = receivePacket.getPort();

					/** 2、回答部分 */
					// 生成随机数，用于模拟传输延迟
					long randomTime = (long) (Math.random() * 1000);
					// 程度睡眠，用于模拟传输延迟
					try {
						this.sleep(randomTime);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					// 如果随机数大于900，模拟数据丢失
					if (randomTime > 900) {
						content = "请求超时\n";
					}
					// 显示请求数据
					System.out.println(content);
					// 请求数据转换成byte数组，用于发回client端
					sendData = content.getBytes();
					// 创建DatagramPacket对象用于发送信息
					DatagramPacket sendPacket = new DatagramPacket(sendData,
							sendData.length, IPAddress, port);
					// 发回client端
					try {
						serverSocket.send(sendPacket);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
