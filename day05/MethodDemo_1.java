/*
	�����Ķ�����ϰ
*/
import java.util.Scanner;
public class MethodDemo_1{
	public static void main(String[] args){
		//printRect();
		//int number=getNumber();
		//System.out.println("�õ������������:"+getNumber());
		
		//printRect2(5,20);
		int avg=getAvg(1,2,3);
		System.out.println(avg);
	}
	/*
		�����з���ֵ�в���������������������ƽ��ֵ
		��ȷ�����������������ͣ�����ֵ����int
		��ȷ����δ֪��������δ֪������
	*/
	public static int getAvg(int a,int b,int c){
		return (a+b+c)/3;
	}
	/*
		�����޷���ֵ�в������������ӡָ��M�У�ÿ��N��*�ŵľ���
		��ȷ�����������������̨���ͼ�Σ�û�з���ֵ��
		��������û��δ֪����ͼ������������������δ֪�ģ�������������int
	*/
	public static void printRect2(int M,int N){
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
		�����з���ֵ�޲��������������¼��õ�һ������
		��ȷ��������������������� int
		��ȷ��û��δ֪��,û
	*/
	public static int getNumber(){
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		return number;
	}
	/*
			�����޷���ֵ�޲������������ӡ3�У�ÿ��3��*�ŵľ���
			Ϊʲôû�з���ֵ:
				��ӡ���Σ����Ч��������Ҫ���������	***
														***
														***
				��ȷδ֪��������Ҫδ֪��
	*/
	public static void printRect(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}