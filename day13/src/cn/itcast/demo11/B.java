package cn.itcast.demo11;
import cn.itcast.demo10.*;
public class B extends A{
	public void show(){
		//受保护权限，只能是子类的里面！！！!调用父类的受保护成员
		abc();
	}
}
