package cn.itcast.demo01;

//import java.util.ArrayList;

public class TestEquals {
	public static void main(String[] args) {
		//Person��̳�Object�࣬�̳������˸���ķ���equals
		Person p1=new Person("����",25);
		//Person p2=new Person("����",20);
		
		//ArrayList<String> array=new ArrayList<>();
		//p1=p2;
		//Person����p1�����ø���ķ���equals,���ж���ıȽ�
		//boolean b=p1.equals(p2);
		//boolean b=p1.equals(array);
		//boolean b=p1.equals(null);
		boolean b=p1.equals(p1);
		System.out.println(b);
	}
}
