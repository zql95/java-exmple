/*
	����Ĳ��ҹ���
		��һ�������У���һ��Ԫ�أ��Ƿ�����������У�������ڣ��ͷ�������
		
		��ͨ��ѯ��
			�ҵ�Ԫ���������г��ֵ����������û�����Ԫ�أ�������Ǹ���
*/
public class ArrayMethodTest_3{
	public static void main(String[] args){
		//int[] arr={4,5,6,7,1,2};
		//int index=search(arr,5);
		
		int [] arr={1,3,4,5,9,11,15};
		int index=binarySearch(arr,5);
		System.out.println(index);
		
	}
	/*
		���巽����ʵ�֣��۰����
		����ֵ:����
		����:���飬���ҵ�Ԫ��
		ʵ�ֲ���:
			1.��Ҫ�ı�������
				����������ָ��
			2.����ѭ���۰�
				�����۰������	min<=max
			3.�ñ���Ԫ�أ����м�Ԫ�ؽ��бȽ�
				Ԫ��>�м�����	Сָ��=�м�+1
				Ԫ��<�м�����	��ָ��=�м�-1
				Ԫ��==�м�����	�ҵ��ˣ������ˣ������м�����
			4.ѭ���������޷��۰�
				Ԫ��û���ҵ�������-1
			
	*/
	public static int binarySearch(int[] arr,int key){
		int min=0;
		int max=arr.length-1;
		int mid=0;
		//ѭ���۰룬����min<=max
		while(min<=max){
			//��ʽ�������м�����
			mid=(min+max)/2;
			if(key>arr[mid]){
				min=mid+1;
			}else if(key<arr[mid]){
				max=mid-1;
			}else{
				//�ҵ�Ԫ�أ�����Ԫ������
				return mid;
			}
		}
		return -1;
	}
	/*
		���巽��,ʵ���������ͨ��ѯ
		����ֵ������
		���������飬���ҵ�Ԫ��
		
		ʵ�ֲ���:
			1.��������
			2.���������У�ʹ��Ԫ�غ������е�Ԫ�ؽ��бȽ�
				�����ͬ���Ż�Ԫ���������е�����
				�����ͬ�����ظ���
	*/
	public static int search(int[] arr,int key){
		//��������
		for(int i=0;i<arr.length;i++){
			//����Ԫ�أ������ҵ�Ԫ�رȽ�
			if(arr[i]==key){
				//��������
				return i;
			}
		}
		return -1;
	}
}
