/*
	ArrayList�����еķ���
	
	add(����)�򼯺������Ԫ�أ����ݴ洢��ȥ
	�����еĲ������ͣ����弯�϶���ʱ���������һ�µ�
	ArrayList<Integer> array=new ArrayList<Integer>();
	array.add(3);
	
	get(int index);ȡ�������е�Ԫ�أ�get�����Ĳ�����д������
	
	size();���ؼ��ϵĳ��ȣ����ϴ洢Ԫ�صĸ���
	
*/
import java.util.ArrayList;
public class ArrayListDemo_1{
	public static void main(String[] args){
		//���弯�ϣ��洢�ַ���Ԫ��
		ArrayList<String> array=new ArrayList<String>();
		//���ü��Ϸ���add�洢Ԫ��
		array.add("abc");
		array.add("itcast");
		array.add("love");
		array.add("java");
		//������ϵĳ��ȣ����ü��Ϸ���size,size�����ķ���ֵ���� int
		int size=array.size();
		System.out.println(size);
		
		//��ȡ�������е�һ��Ԫ�أ���ȡ1������Ԫ��
		//���ϵķ���get,��ȡԪ�غ�����������
		String s=array.get(1);// array.get(11):java.lang.IndexOutOfBoundsException: Index: 11, Size: 4
		System.out.println(s);
		
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println(array.get(3));
	}
}