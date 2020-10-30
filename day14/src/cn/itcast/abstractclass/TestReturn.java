package cn.itcast.abstractclass;

public class TestReturn {
	public static void main(String[] args) {
		//调用getAnimal类的方法，getAnimal，返回值是Animal
		GetAnimal g=new GetAnimal();
		//方法的返回了Animal类型，retrun new Cat()
		Animal a=g.getAnimal(1);
		a.eat();
		
	}
}
