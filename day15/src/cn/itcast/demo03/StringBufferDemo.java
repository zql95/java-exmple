package cn.itcast.demo03;

public class StringBufferDemo {
	public static void main(String[] args) {
//		function();
//		function_1();
//		function_2();
//		function_3();
//		function_4();
		function_5();
	}
	/*
	 * StringBuffer��ķ���
	 * 	String toString() �̳�Object,��дtoString()
	 * 	���������е������ַ�������ַ���
	 */
	public static void function_5(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("abcdef");
		buffer.append(12345);
		
		//���ɱ���ַ������������󣬱���˲��ɱ�String����
		String s=buffer.toString();
		System.out.println(s);
	}
	
	/*
	 * StringBuffer��ķ���
	 * 	reverse() ���������е��ַ���ת
	 */
	public static void function_4(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("abcdef");
		
		buffer.reverse();
		System.out.println(buffer);
	}
	
	/*
	 * StringBuffer�෽��
	 * 	replace(int start,int end,String str)
	 * 	��ָ����������Χ�ڵ������ַ����滻���µ��ַ���
	 */
	public static void function_3(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("abcdef");
		
		buffer.replace(1, 4, "Q");
		System.out.println(buffer);//**����ʵ�����ǵ�����toString()����
	}
	
	/*
	 * StringBuffer�෽�� insert
	 * 	insert(int index,��������)
	 * 	�������������ݣ����뵽��������ָ��������
	 */
	public static void function_2(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("abcdef");
		buffer.insert(3, 9.5);
		System.out.println(buffer);
	}
	
	/*
	 * StringBuffer�෽��
	 * 	delete(int start,int end) ɾ���������е��ַ�
	 * 	��ʼ������������β����������
	 */
	public static void function_1(){
		StringBuffer buffer=new StringBuffer();
		buffer.append("abcdef");
		buffer.delete(1, 5);
		//buffer.delete(0, buffer.length());
		System.out.println(buffer);
	}
	
	/*
	 * StringBuffer�෽��
	 * StringBuffer append,���������͵����ݣ���ӻ�����
	 * append ����ֵ��дreturn this
	 * ��������˭������ֵ����˭
	 */
	public static void function(){
		StringBuffer buffer=new StringBuffer();
		//����StringBuffer����append�򻺳���׷������
		buffer.append(6).append(false).append('a').append(1.5);//����������
		System.out.println(buffer);
	}
}
