/*
	���ԣ��ն���õ�Phone��
	�����������ͱ�����ʽ
		
		�������� ������=new ��������();
		
		ʵ���������͵Ĳ���
			1:��������඼����ͬһ���ļ��У�����Ҫ�����
			2:�����������͵ı���
			3:����.�����еĹ���
*/
public class TestPhone{
	public static void main(String[] args){
		Phone p=new Phone();
		//System.out.println(p);//����ڴ�ĵ�ַ
		//����.�����еĹ���
		//����p.�ķ�ʽ���������е�����
		//���Ծ��Ǳ���,��ֵ�ͻ�ȡֵ
		p.color="������";
		p.brand="������";
		p.size=5.0;
		
		//��ȡ����ֵ
		System.out.println(p.color+" "+p.brand+" "+p.size);
	}
}