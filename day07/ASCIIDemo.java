/*
	ASCII�������ʾ
	�ַ�Java	�������ͣ�char
	����Java	�������ͣ�int
	
	int ���ͺ�char ��������ת��
	char �����ֽڣ�int �ĸ��ֽ�
	
	charת��int���͵�ʱ�������Զ�������char�������ͣ����ѯ������õ�����
	intת��char���͵�ʱ��ǿ��ת����int�������ͣ����ѯ������õ��ַ���
	char�洢���֣����ѯUnicode�����
	
	char���Ժ�int���㣬����Ϊint���ͣ��ڴ��������ֽ�
	charȡֵ��Χ�ǣ�0-65535���޷��ŵ���������
*/
public class ASCIIDemo{
	public static void main(String[] args){
		char c='a';
		int i=c+1;
		System.out.println(i);
		
		int j=90;
		char h=(char)j;
		System.out.println(h);
		
		System.out.println((char)6);
		/*for(int k=0;k<=127;k++){
			System.out.println((char)k);
			
		}*/
		
		char k='��';
		System.out.println(k);
		
		char m=-1;
	}
}