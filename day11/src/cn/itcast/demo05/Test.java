package cn.itcast.demo05;

public class Test {
	public static void main(String[] args) {
		//��̬���÷������������������������д����
		
		//Java�У�����Ķ�̬�ԣ����ó����еķ���
		//��ʽ:�������ͻ����ǽӿ�����	����=new �������();
		Fu f=new Zi();
		f.show();
		
		//������Animal,������Cat
		Animal a=new Cat();
		a.eat();
		
		//�ӿ�Smoking,ʵ����Student
		Smoking sk=new Student();
		sk.smoking();
	}
}
