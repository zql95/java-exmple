package cn.itcast.demo05;
/*
 * ���������������ͱ��������Է���ʹ��
 * ��������û�����ñ�����ֻ��ʹ��һ��
 * 
 * ����������Ե�����������
 * ����������Ե��������ķ���ֵ
 */
//import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Person p=new Person();
		p.eat();
		
		new Person().eat();
		new Person().eat();
		
	/*	int number=new Scanner(System.in).nextInt();
		int number2=new Scanner(System.in).nextInt();*/
		/*Scanner sc=new Scanner(System.in);
		sc.next();
		sc.nextInt();*/
		
		method(new Person());
		
		Person p1=method();
		p1.eat();
		
	}
	//��������ֵ��Person����
	//����return��䣬���ص��������Ķ���
	public static Person method(){
		//Person p=new Person();
		return new Person();
	}
	
	//���÷���method������Person���Ͷ���
	public static void method(Person p){
		p.eat();
	}
}
