package cn.itcast.demo06;
/*
 * �ڲ���Ķ���
 * 		���ڲ��࣬���������ⲿ��ĳ�Աλ��
 * ����Outer,�ڲ�����Inner
 * 
 * ��Ա�ڲ��࣬����ʹ�ó�Ա���η���public,static ......
 * Ҳ�Ǹ��࣬���Լ̳У�����ʵ�ֽӿ�
 * 
 * ���ù����ڲ��࣬����ʹ���ⲿ��ĳ�Ա������˽��
 * �ⲿ��Ҫʹ���ڲ���ĳ�Ա�����뽨���ڲ������
 */
public class Outer {
	private int a=1;
	//�ⲿ���Աλ�ã������ڲ���
	class Inner{
		public void inner(){
			System.out.println("�ڲ��෽��inner "+a);
		}
		//int b=1;
	}
}
