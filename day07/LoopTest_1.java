/*
	Ҫ�󣺼����ˮ�ɻ���
		��λ��100-999 ��λ��������+ʮλ��������+��λ��������=�Լ�����
		153=1*1*1+5*5*5+3*3*3
		��֪��λ��	123 ��ȡ��ÿ��λ��	����	����,ȡģ����
		
		ʵ�ֲ��裺
		1.��������洢	������λ�ϵ�����
		2.����ѭ����ѭ���еı�������100�仯��999
		3.ѭ���еõ���λ���������㷨����������������λ
		4.��������λ��������ͼ��㣬��������ͣ������Լ����бȽ��ж�
			��ͬ������ˮ�ɻ��� 
*/
public class LoopTest_1{
	public static void main(String[] args){
		//������������
		int bai=0;
		int shi=0;
		int ge=0;
		for(int i=100;i<1000;i++){
			//��i,���м��㣬��ȡ��������λ
			//��ȡ��λ
			bai=i/100;
			//��ȡʮλ
			shi=i/10%10;
			//��ȡ��λ
			ge=i%10;
			//��������λ�����������
			if(bai*bai*bai+shi*shi*shi+ge*ge*ge==i){
				System.out.println(i);
			}
		}
	}
}