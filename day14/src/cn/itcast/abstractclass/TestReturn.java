package cn.itcast.abstractclass;

public class TestReturn {
	public static void main(String[] args) {
		//����getAnimal��ķ�����getAnimal������ֵ��Animal
		GetAnimal g=new GetAnimal();
		//�����ķ�����Animal���ͣ�retrun new Cat()
		Animal a=g.getAnimal(1);
		a.eat();
		
	}
}
