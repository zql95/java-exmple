package cn.itcast.demo04;
/*
 * ����õ�Person����в���
 * �������󣬶���������Ժͷ���
 */
public class PersonTest {
	public static void main(String[] args) {
		//����Person��Ķ��� new
		Person p=new Person();
		//�Գ�Ա������ֵ
		p.name="����";
		//�Գ�Ա����age��ֵ��ֻ�ܵ���set������ֵ
		p.setAge(50);
		//�������з���
		p.speak();
		
		//�����Ա����ageֵ���������get����
		System.out.println(p.getAge());
	}
}
