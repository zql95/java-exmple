package cn.itcast.demo06;
/*
 * ���췽����һ�У�дthis()����super()
 * ����ͬʱ���ڣ���ѡ��һ����֤����Ĺ��췽�����õ�����Ĺ��췽������
 * 
 * С���ۣ�������Σ���������й��췽����ֱ�ӣ���ӱ�����õ�����Ĺ��췽��
 * ����Ĺ��췽����ʲô����д��Ĭ�ϵĹ��췽����һ��super();
 */
public class Student extends Person{
	public Student(){
		//���õ����Լ��Ĺ��췽��
		//�����ʽ���õ��˸���Ĺ��췽��
		this("abc");
	}
	
	public Student(String s){
		super(2);
	}
}
