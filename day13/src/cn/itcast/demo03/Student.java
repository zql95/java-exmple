package cn.itcast.demo03;
/*
 * ��̬��ע������
 * 
 * �ھ�̬�в��ܵ��÷Ǿ�̬
 * 
 * Ϊʲô�أ�Ϊʲô��̬���ܵ��÷Ǿ�̬����������
 * ��̬�����ڷǾ�̬�������ڴ���
 * 
 * ��̬ ǰ�� ����  �Ǿ�̬  ����
 * 
 * ��̬����дthis,����дsuper
 * 
 * ���⣺static ���ε���ʲôʱ��ʹ�ã�Ӧ�ó���
 * 	static ���γ�Ա��������Ա����
 * 	��Ա������static,���ݾ�����������������
 * 		���������ʱ�򣬶������֮���Ƿ��й��Ե����ݣ���
 * 		���㽫���Ե����ݶ���Ϊ��̬�ĳ�Ա����
 * 	
 * 	��Ա������static,���ű�����
 * 		���������û�е��ù��Ǿ�̬��Ա������������Ϊ��̬
 * 
 */
public class Student {
	private static String name;
	private static int age;
	private char sex;
	
	public static void function(){
		System.out.println(name+age);
	}
	public void function2(){
		System.out.println(name+age+sex);
	}
	
	public static int getSum(int a,int b,int c){
		return a+b+c;
	}
	
	public void show2(){
		System.out.println(sex);
	}
	
	public void show(){
		System.out.println(name+age);
	}
	
	public static void main(String[] args) {
		method();
	}
	
	public static void method(){
		
	}
}
