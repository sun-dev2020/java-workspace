package javaDemo;

public class Employee {

	String name;
	int age;
    double salary;
	static int[] ary = new int[3];  //静态变量
	
	public static final int BOXWIDTH = 10;  //类常量
	
	public transient int limit = 10;   //对象持久化时，不会保存
	
	public Employee(String name) {
		this.name = name;
		ary[0] = 1;
	}
	
	public void empAge(int empAge) {
		age = empAge;
	}
	
	public void empSalary(double empSalary) {
		salary = empSalary;
	}
	
	public void printInfor() {
		System.out.println("名字:" + name);
		System.out.println("年龄:" + age);
	}
	
	public static void func() {
		System.out.println("class func");
	}
	
	public void addSalary() {
		for(int x = 0 ; x < 10 ; x++) {
			this.salary += 10.f;
		}
	}
}

abstract class Caravan{
	public abstract void goFast();   //抽象方法 不提供实现 子类来实现
}

class SubCaravan extends Caravan{
	public void goFast() {
		System.out.println("abstract func");
	}
	
	String name = "tom";
	boolean result = name instanceof String;   //类型判断
	
}











