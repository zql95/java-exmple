package cn.itcast.demo08;

/*
 * 描述的是网络维护工程师
 * 属于维护部的员工，继承维护部类
 */
public class NetWork extends Maintainer {
	public void work() {
		// 调用父类的get方法，获取name,id值
		System.out.println("网络工程师在检查网络是否畅通 "+super.getName()+"..."+super.getId());
	}
}
