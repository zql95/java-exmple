package cn.itcast.demo12;
/*
 * ��̬����飬ִֻ��һ��
 * �������飬newһ�Σ���ִ��һ�Σ������ڹ��췽��
 * ���췽����new һ�Σ���ִ��һ��
 */
public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.age=age;
		this.name=name;
		System.out.println("���ǹ��췽��");
	}
	
	//��������
	{
		System.out.println("���ǹ�������");
	}
	
	//��̬�����
	static{
		System.out.println("���Ǿ�̬�����");
	}
}
