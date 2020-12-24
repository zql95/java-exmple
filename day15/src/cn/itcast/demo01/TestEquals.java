package cn.itcast.demo01;

//import java.util.ArrayList;

public class TestEquals {
	public static void main(String[] args) {
		//Person类继承Object类，继承下来了父类的方法equals
		Person p1=new Person("李四",25);
		//Person p2=new Person("张三",20);
		
		//ArrayList<String> array=new ArrayList<>();
		//p1=p2;
		//Person对象p1，调用父类的方法equals,进行对象的比较
		//boolean b=p1.equals(p2);
		//boolean b=p1.equals(array);
		//boolean b=p1.equals(null);
		boolean b=p1.equals(p1);
		System.out.println(b);
	}
}
