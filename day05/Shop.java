/*
	ʵ����Ʒ�Ŀ�����
		���ܣ�
			1.չʾ�û�ѡ�����嵥
			2.����ѡ��Ĺ��ܱ�ţ����в�ͬ�Ĳ���
				A.չʾ���п��
				B.�޸Ŀ������
		����:
			1.չʾ�û��嵥:
				�����䣬�û����룬ѡ�������
			2.����ѡ�񣬵��ò�ͬ�ķ���
				switch���
					case 1 2 3
				A 	չʾ���
					���洢��Ʒ�����飬����
				B 	�޸Ŀ��
					�޸����еĿ������
*/
import java.util.Scanner;
public class Shop{
	public static void main(String[] args){
		//ʹ�����飬������Ʒ����Ϣ
		//Ʒ�����ߴ磬�۸񣬿����������5������
		String[] brand={"MacBookAir","ThinkpadT450"};
		double[] size={13.3,15.6};
		double[] price={9998.97,6789.56};
		int[] count={0,0};
		while(true){
		int choose=chooseFunction();
		switch(choose){
			case 1:
				//���ò鿴����嵥����
				printStore(brand,size,price,count);
			break;
				
			case 2:
				//�����޸Ŀ��ķ���
				update(brand,count);
			break;
			case 3:
				return ;
			default:
				System.out.println("û���������");
			break;
		}
		}
	}
	/*
		���巽�����޸�������Ʒ�Ŀ��
		�û�����1�����޸�1��
		����ֵ��û��
		�����������������,Ʒ������
	*/
	public static void update(String[] brand,int[] count){
		//�������飬������һ�����޸�һ��
		//���ܼ�������
		Scanner sc=new Scanner(System.in);
		
		//��������
		for(int i=0;i<brand.length;i++){
			System.out.println("������"+brand[i]+"�Ŀ����");
			//�������룬¼���棬�洢������������
			int newCount=sc.nextInt();
			count[i]=newCount;
		}
		//int chooseNumber=sc.nextInt();
	}
	/*
		���巽����չʾ���еĿ���嵥������
		����ֵ��û��
		����������
	*/
	public static void printStore(String[] brand,double[] size,double[] price,int[] count){
		System.out.println("-----------��Ʒ����嵥-----------");
		System.out.println("Ʒ���ͺ�	�ߴ�	�۸�	�����");
		//��������������ܿ�棬���ܼ۸�
		int totalCount=0;
		int totalMoney=0;
		//�������飬�����������е���Ʒ��Ϣ��ӡ����
		for(int i=0;i<brand.length;i++){
			System.out.println(brand[i]+"	"+size[i]+"	"+price[i]+"	"+count[i]);
			totalCount+=count[i];
			totalMoney+=count[i]*price[i];
		}
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("��Ʒ����ܽ��: "+totalMoney);
		
	}
	/*
		���巽����ʵ���û���ѡ���ܣ����ܵ���Ҫ������
		����ֵ��int
		������û��
		
	*/
	public static int chooseFunction(){
		System.out.println("--------------������---------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ������: ");
		//���ܼ�������
		Scanner sc=new Scanner(System.in);
		int chooseNumber=sc.nextInt();
		
		return chooseNumber;
	}
	
}