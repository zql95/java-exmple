/*
	����Ĳ�����
		ͬʱ���ԣ��緹����������ѧ��
*/
public class Test{
	public static void main(String[] args){
		//�����緹����������
		DianFanGuo dfg=new DianFanGuo();
		
		dfg.brand="��˹��";
		dfg.color="��ɫ";
		dfg.size=30;
		
		System.out.println(dfg.brand+" "+dfg.color+" "+dfg.size);
		
		//����������������
		Car c=new Car();
		c.brand="����";
		c.paiLiang=0.5;
		c.type="������";
		
		System.out.println(c.brand+" "+c.paiLiang+" "+c.type);
		
		//����ѧ����������
		Student stu=new Student();
		stu.name="����";
		stu.age=20;
		stu.sex='��';
		
		System.out.println(stu.name+" "+stu.age+" "+stu.sex);
	}
}