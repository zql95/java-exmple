package cn.itcast.demo06;

public class Person {
	private int age;
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return age;
	}
	
	/*
	 * ���巽�����Ƚ��Ƿ���ͬ���ˣ��Ǿͷ���true,���Ǿͷ���false
	 * ˭��˭��ѽ�����Լ��ͱ��˱�
	 * �����ķ���ֵ: true false
	 * ��������������
	 */
	public boolean compare(Person p){
		//�Լ��ͱ��˱����䣬�Լ���˭ this ��p
		return this.getAge()==p.getAge();
		
	}
}
