package cn.itcast.demo04;
/*
 * 多态调用中，成员变量编译运行都看父类的,成员方法编译运行都看父类
 * 多态调用中，编译看谁，运行看谁
 * 编译都看=左边的父类，父类有编译成功，父类没有编译失败
 * 运行看，静态方法，运行父类中的静态方法
 * 运行看，非静态方法，运行子类的重写方法
 * 成员变量，编译运行全看父类
 */
public class Test {

	public static final double PI=3.14;
	
	public static void main(String[] args) {
		Fu f=new Zi();
		//System.out.println(f.i);
		//调用的还是父类的静态方法，原因：静态属于类，不属于对象
		//对象的多态性，静态和对象无关，父类的引用.静态方法
		f.show();
		f.show2();
		System.out.println(Test.PI);
	}
}
