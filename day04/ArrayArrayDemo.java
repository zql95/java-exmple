/*
	��ά����
		�����е����飬��������洢�Ļ������顣
	
	���巽ʽ��һά���������
	int [][] arr=new int[3][4];
	����һ����ά����
	[3] ��ʾ����ά�����У�������һά����
	[4] ��ʾ������һά�����У�ÿ������ĳ�����4
*/


public class ArrayArrayDemo{
	public static void main(String[] args){
		int [][] arr=new int[3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[2][4]);//java.lang.ArrayIndexOutOfBoundsException: 4
	}
}