package cn.itcast.demo05;
/*
 * �������ˣ�
 * 	���ԣ�����������
 * 	������˵��
 * 
 * ˽�л����е����ԣ���Ա������������д��Ӧ��get/set����
 * �����Զ�����࣬�Զ����Ա������Ӧ��˽�л����ṩget/set
 * 
 * this�ؼ��֣�
 * 	���ֳ�Ա�����;ֲ�����ͬ�����
 * 	�����У����ʳ�Ա������дthis.
 */
public class Person {
	private String name;
	private int age;
	
	//set������Ϊ����name,age��ֵ
	public void setAge(int age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	
	//get����������name,age��ȡֵ
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	
	public void speak(){
		String name="����";
		int age=16;
		System.out.println("����˵�� "+this.name+"..."+this.age);
	}
}
