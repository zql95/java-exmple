/*
	方法，调用中的参数传递问题
		1.方法参数是基本数据类型
		2.方法参数是引用类型
			传递的是内存地址！！！
*/
public class MethodDemo_3{
	public static void main(String[] args){
		/*int a=1;
		int b=2;
		chang(a,b);
		System.out.println(a);
		System.out.println(b);
		*/
		int[] arr={1,2,3,4};
		System.out.println(arr[2]);
		chang(arr);
		System.out.println(arr[2]);
	}
	
	public static void chang(int[] arr){
		arr[2]=100;
	}
	public static void chang(int a,int b){
		a=a+b;
		b=b+a;
		System.out.println(a);
		System.out.println(b);
		System.out.println("===============");
		
		
	}
}