package cn.itcast.abstractclass;

public class GetAnimal {
	/*
	 * 定义方法，方法的返回值是Animal类型
	 * 抽象类,抽象类没有对象的，因此在方法的return后，
	 * 返回Animal的子类的对象
	 */
	public Animal getAnimal(int i){
		if(0==i){
			return new Cat();
		}
		return new Dog();
		
	}
}
