package cn.itcast.abstractclass;

public class GetAnimal {
	/*
	 * ���巽���������ķ���ֵ��Animal����
	 * ������,������û�ж���ģ�����ڷ�����return��
	 * ����Animal������Ķ���
	 */
	public Animal getAnimal(int i){
		if(0==i){
			return new Cat();
		}
		return new Dog();
		
	}
}
