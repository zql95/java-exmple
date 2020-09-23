import java.util.ArrayList;
import java.util.Scanner;

/*
 *	���й���ϵͳ����
 * 	ʵ�֣�
 * 		1.��Ʒ���ݵĳ�ʼ��
 * 		2.�û��Ĳ˵�ѡ��
 * 		3.����ѡ��ִ�в�ͬ�Ĺ���
 * 			3.1	Read   �鿴��Ʒ
 * 			3.2 Create �����Ʒ
 * 			3.3 Update �޸���Ʒ
 * 			3.4	Delete ɾ����Ʒ
 * 	���й��ܣ����붨�巽��ʵ��
 * 	������main	��������
 */
public class Shopp {

	public static void main(String[] args) {
		//����ArrayList���ϣ��洢��Ʒ���ͣ��洢��������FruitItem����
		ArrayList<FruitItem> array=new ArrayList<FruitItem>();
		//������Ʒ��ʼ�����������ݼ���
		init(array);
		while(true){
			//���ò˵�����
			mainMenu();
			//�����û�ѡ����ŷ���
			int choose=chooseFunction();
			switch (choose) {
			case 1:
				//����1: �����嵥
				showFruitList(array);
				break;
			case 2:
				//2: ��ӻ���
				addFruit(array);
				break;
			case 3:
				//3: ɾ������
				deleteFruit(array);
				break;
			case 4:
				//4: �޸Ļ���
				updateFruit(array);
				break;
			case 5:
				//5: �˳�
				return;
			default:
				System.out.println("��������û��");
				break;
			}
		}
	}
	/*
	 * ���巽����ʵ����Ʒ���޸Ĺ���
	 * ����ֵ:��
	 * ����������
	 * 
	 * ��ʾ�û�ѡ������޸Ĺ���
	 * ��ʾ�û�������Ҫ�޸ĵ���Ʒ���
	 * �������ϣ���ȡÿ��FruitItem����
	 * ��������Id���ԣ����Ժ��û�����ı�űȽ�
	 * �����ͬ��
	 * 	�޸ĵ�FruitItem�е�����ֵ
	 * 	��������
	 * 
	 */
	public static void updateFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ������޸Ĺ���");
		System.out.println("��������Ʒ�ı��");
		
		Scanner sc=new Scanner(System.in);
		int Id=sc.nextInt();
		//�������ϣ���ȡÿ��FruitItem����
		for(int i=0;i<array.size();i++){
			FruitItem item=array.get(i);
			//��ȡFruitItem������Id,���û������Id���Ƚ�
			if(item.Id==Id){
				System.out.println("�����µ���Ʒ���");
				item.Id=sc.nextInt();
				
				System.out.println("�����µ���Ʒ����");
				item.name=sc.next();
				
				System.out.println("�����µ���Ʒ�۸�");
				item.price=sc.nextDouble();
				System.out.println("��Ʒ�޸ĳɹ�");
				return;
			}
		}
		System.out.println("����ı�Ų�����");
	}
	/*
	 * ���巽����ʵ����Ʒ��ɾ������
	 * ����ֵ:��
	 * ����:����
	 * 
	 * ɾ������������Ʒ�ı��
	 * ��ʾ�û�ѡ�����ɾ������
	 * ����������Ʒ�ı��
	 * �������ϣ���ȡ�����е�ÿ��FruitItem����
	 * ������������	Id,���û�����ı�ţ��Աȣ���ͬ��ɾ��
	 */
	public static void deleteFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ�����ɾ������");
		System.out.println("��������Ʒ�ı��");
		Scanner sc=new Scanner(System.in);
		int Id=sc.nextInt();
		
		//��������
		for(int i=0;i<array.size();i++){
			//��ȡÿ��FruitItem����
			FruitItem item=array.get(i);
			//��������������Id�����û�����ı�űȽ�
			if(item.Id==Id){
				//�Ƴ������е�Ԫ��
				//���ϵķ���removeʵ��
				array.remove(i);
				System.out.println("ɾ���ɹ�");
				return;
			}
		}
		System.out.println("������ı�Ų�����");
	}
	/*
	 * ���巽����ʵ����Ʒ����ӹ���
	 * ����ֵ:��
	 * ����:����
	 * ��ʾ�û�ѡ����������Ʒ�Ĺ���
	 * 
	 * ��ʾ�û��������ʲô
	 * 
	 * ����FruitItem�������������õ�����
	 * �������ÿ����Ʒ���Խ��и�ֵ
	 */
	public static void addFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ����������Ʒ����");
		//����Scanner����
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ʒ�ı��");
		//���������Ʒ�ı��
		int Id=sc.nextInt();
		//������Ʒ������
		System.out.println("��������Ʒ������");
		String name=sc.next();
		//������Ʒ�ĵ���
		System.out.println("��������Ʒ�ĵ���");
		double price=sc.nextDouble();
		//����FruitItem����
		FruitItem item=new FruitItem();
		item.Id=Id;
		item.name=name;
		item.price=price;
		array.add(item);
		
	}
	/*
	 * ���巽����ʵ����ʾ�����嵥�Ĺ���
	 * ����ֵ:��
	 * ����:����
	 * �������ϣ���ȡ�����е�ÿ��FruitItem����������.��������
	 */
	public static void showFruitList(ArrayList<FruitItem> array){
		System.out.println();
		System.out.println("=========��Ʒ����嵥=========");
		System.out.println("��Ʒ���                ��Ʒ����                ��Ʒ����");
		//��������
		for(int i=0;i<array.size();i++){
			//����get��������ȡÿ��FruitItem����������ʹ��FruitItem����get���
			FruitItem item=array.get(i);
			//����item�������е�����
			System.out.println(item.Id+"        "+item.name+"        "+item.price);
		}
	}
	/*
	 * ���巽����ʵ�ֽ����û��ļ�������
	 * ���ر��
	 * 
	 */
	public static int chooseFunction(){
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	
	/*
	 * ���巽����ʵ�����˵�
	 * ��ʾ�û���Щѡ�� ��ѡ�����
	 * ����ֵ����
	 * ��������
	 */
	public static void mainMenu(){
		System.out.println();
		System.out.println("========��ӭ����ItCast����========");
		System.out.println("1: �����嵥 2: ��ӻ��� 3: ɾ������ 4: �޸Ļ��� 5: �˳�");
		System.out.println("��������Ҫ�����Ĺ������");
	}
	
	/*
	 * ���巽����ʵ����Ʒ���ݵĳ�ʼ��
	 * �Ƚ�һ�������ݣ��洢������
	 * ����ֵ:û��
	 * ����:����
	 * ������:init
	 */

	private static void init(ArrayList<FruitItem> array) {
		//���������FruitItem���ͣ��������Ը�ֵ
		FruitItem f1=new FruitItem();
		f1.Id=9527;
		f1.name="�������ֱ�����";
		f1.price=12.7;
		
		FruitItem f2=new FruitItem();
		f2.Id=9008;
		f2.name="�п�����ĵ����";
		f2.price=5.6;
		
		FruitItem f3=new FruitItem();
		f3.Id=9879;
		f3.name="�½�ԭ�����ܹ�";
		f3.price=599.6;
		
		//������3��FruitItem���ͱ������洢��������
		array.add(f1);
		array.add(f2);
		array.add(f3);
	}
	
}
