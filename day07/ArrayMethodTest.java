/*
	���巽����ʵ������ı���
	�����У�������	[11,33,565,66,78,89]
	int [] arr={3,4,45,7};
	��������ַ�����[] ,
	ʵ�ֲ���:
		1.���巽��ʵ������ı���
		2.�ȴ�ӡ[	������
			��������Ԫ�غͶ���
			�ж��Ƿ����������������һ��Ԫ�أ���������һ��Ԫ�أ����]������
*/

public class ArrayMethodTest{
	public static void main(String[] args){
		int [] arr={11,44,55,33,66};
		printArray(arr);
		
		int [] arr2={22,88,99,33,66};
		printArray(arr2);
	}
	/*
		���巽����ʵ�ֹ���
		����ֵ:void
		��������:����
	*/
	public static void printArray(int [] arr){
		//���һ�������ţ���Ҫ���д�ӡ
		System.out.print("[");
		//������б���
		for(int i=0;i<arr.length;i++){
			//�жϱ�������Ԫ�أ��ǲ�����������һ��Ԫ��
			//����ж� ѭ������	����	length-1
			if(i==arr.length-1){
				//��������Ԫ�غ�]
				System.out.print(arr[i]+"]");
			
			}
			else{
				//������������һ��Ԫ�أ��������Ԫ�غͶ���
				System.out.print(arr[i]+",");
			}
		}
		System.out.println();
	}
}