package cn.itcast.demo02;
/*
 * �ӿ��г�Ա���ص�
 * 	1.��Ա�������ص㣬û�б��������ǳ���
 * 	�̶������ʽ:public static final �������� 	������=ֵ;
 * 	public	Ȩ��
 * 	static	���Ա�����ֱ��.����
 * 	final	���գ��̶�ס������ֵ
 * 
 * 	ע�⣺public static final ���η����ڽӿڵĶ����У�����ʡ�Բ�д
 * 	���ǣ���д������û��
 * 	�������η���������ѡ������д
 * 
 * 	2.�ӿ��еĳ�Ա�����ص�
 * 		public abstract ����ֵ���� ������(�����б�);
 * 		���η� public abstract ���Բ�д��ѡ������д
 * 		���ǣ�д��д������
 * 	3.ʵ���࣬ʵ�ֽӿڣ���д�ӿ�ȫ�����󷽷�������ʵ�������
 * 		ʵ���࣬��д��һ���ֳ��󷽷���ʵ���࣬����һ��������
 */
public interface MyInter {
	//public static final int x=3;
	//int x=3;
	public static final int x=3;
	
	public abstract void show();
	
	public abstract int getSum(int a,int b);
}
