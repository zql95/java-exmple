package cn.itcast.demo02;

public class Test {
	public static void main(String[] args) {
		Zi z=new Zi();
		z.function();
		z.show();
		
		final int i=10;//��final���Σ�һ�θ�ֵ��������
		//int j=i+1;
		System.out.println(i);
		
		//final�������ñ�������
		//������������ڴ��ַ��������  z2=0xa5b6
		final Zi z2=new Zi();
		z2.function();
		//z2=null;
		//z2=new Zi();
		
		
	}
}
