package cn.itcast.demo07;
/*
 * ������Ƚ��������������ֵ
 * �ؼ��֣�instanceof,�Ƚ�������������
 * 
 * Person p=new Student();
 * p=new Teacher();
 * 
 * 
 * �ؼ��� instanceof �Ƚϣ�һ���������͵ı������ǲ���������͵Ķ���
 * p��������Student���Ͷ��󣬻���Teacher���Ͷ���
 * 
 * ���ñ��� instanceof ����
 * p instanceof Student	�Ƚϣ�p�ǲ���Student���͵Ķ�������ǣ�instanceof�Ż�true
 * 
 */
public class Test {
	public static void main(String[] args) {
		Person p=new Student();
		Student s=(Student)p;
		s.study();
		
		//Person p=new Teacher();
		
		boolean b=p instanceof Student;
		System.out.println(b);
		
		//b=p instanceof Animal;
		//System.out.println(b);
		p.sleep();
	}
}
