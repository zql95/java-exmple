/*
	����Ƕ��forѭ����ʵ��99�˷���
	
	ʵ�ֲ���:
		1.������ѭ����������
		2.��ѭ�����Ƹ�����������ÿ�ζ��ڵ���
		3.ѭ����������˷���ĸ�ʽ	1*3=3
		
	
*/

public class LoopTest_3{
	public static void main(String[] args){
		print99(9);
	}
	
	public static void print99(int m){
		//������ѭ����ѭ��9��
		for(int i=1;i<=m;i++){
			//������ѭ����ÿ�ε�����ѭ��������<=i
			for(int j=1;j<=i;j++){
				//���ձ�׼��ʽ�������ӡ
				System.out.print(j+"*"+i+"="+j*i+"\t");//\t	tab��
			}
			System.out.println();
		}
	}
}