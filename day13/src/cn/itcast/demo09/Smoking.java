package cn.itcast.demo09;

public interface Smoking {
	public abstract void smoking();
}
/*
 * ʵ���࣬ʵ�ֽӿڣ���д�ӿڳ��󷽷�������ʵ�������
 * class XXX implements Smoking{
 * 		public void smoking(){
 * 			
 * 		}
 * }
 * XXX x=new XXX();
 * x.smoking();
 * 
 * Smoking s=new XXX();
 * s.smoking();
 * 
 * �����ڲ��࣬�����⣺����ʵ���࣬��д����������ʵ������󣬺�Ϊһ�����
 */