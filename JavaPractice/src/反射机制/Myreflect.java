package 反射机制;

import java.lang.reflect.*;

import 抽象继承_组合.Laptop;

/**
 * @author CSH 2015-2-12下午4:45:50 利用反射机制检查类信息
 */
public class Myreflect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class c = Math.class;
		System.out.println("类名："+c.getName());
		System.out.println("父类"+c.getSuperclass());
		System.out.println("类修饰符："+Modifier.toString(c.getModifiers()));
		Type[] ifs = c.getInterfaces();
		if (ifs.length != 0) {
			for (Type inf : ifs) {
				System.out.println("接口："+inf.toString());
			}
		} else {
			System.out.println("没有接口");
		}
		Member[] mes = c.getMethods();
		if (mes.length != 0) {
			for (Member mem : mes) {
				System.out.println("方法："+mem.toString());
			}
		} else {
			System.out.println("没有方法");
		}

	}

}
