package cn.itcast.interfaces;

public class TestReturn {
	public static void main(String[] args) {
		//������GetSmoking��ķ���getSmoking��ȡSmoking�ӿڵ�
		//ʵ����Ķ���
		GetSmoking g=new GetSmoking();
		//������ִ�н���ǽӿڵ�ʵ����Ķ���new Student();
		Smoking s=g.getSmoking();
		s.smoking();
	}
}
