package cn.itcast.interfaces;

public class TestReturn {
	public static void main(String[] args) {
		//调用类GetSmoking类的方法getSmoking获取Smoking接口的
		//实现类的对象
		GetSmoking g=new GetSmoking();
		//方法的执行结果是接口的实现类的对象new Student();
		Smoking s=g.getSmoking();
		s.smoking();
	}
}
