package cn.itcast.demo01;
/*
 * �Զ����Person�࣬��Ա������name,age
 * Ҫ����new Person��ͬʱ����ָ���ã�name,age��ֵ
 * ʵ�ֹ��ܣ����÷���ʵ�֣����췽���������� Constructor
 * ���ã���new��ͬʱ�Գ�Ա������ֵ������������Գ�ʼ����ֵ new Person ������name,age��ֵ
 * 
 * ���췽���Ķ����ʽ
 * 	Ȩ��  ������(�����б�){	
 *  }
 *  ���������֣���������������ȫһ��
 *  ���췽��������д����ֵ���ͣ�void Ҳ����д
 *  
 *  ���췽����ʲôʱ��������,��new ��ʱ���Զ�ִ��
 *  ֻ����һ�Σ����˶���
 *  
 *  ÿ��class����ӵ�й��췽�������췽����дҲ��
 *  �����ʱ��javac,���Զ���������Ƿ��й��췽��
 *  ����У���������
 *  ���û�У��������ͻ��Զ�����һ�����췽��
 *  	�������Զ����ӵĹ��췽����public Person(){}
 *  �Լ���д�˹��췽���������ʱ�򣬲����Զ����ӹ��췽����
 */
public class Person {
	private String name;
	private int age;
	
	//�����Person��Ĺ��췽��
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		//System.out.println("����һ���ղ����Ĺ��췽��");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}