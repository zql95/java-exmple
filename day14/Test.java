import cn.itcast.sum.*;
/*
设置环境变量：classpath 告知JVM，去哪个路径下找可以运行的class
文件
set classpath=E:\workspace\haha.jar;//临时配置变量

*/
public class Test{
	public static void main(String[] args){
		//调用GetSum类方法getSum求和计算
		int sum=GetSum.getSum(1,2);
		System.out.println(sum);
	}
}