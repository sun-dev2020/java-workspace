package javaDemo;

public class Employee {

	String name;
	int age;
    private 	String designation = "";
	double salary;
	static int[] ary = new int[3];
	
	public Employee(String name) {
		this.name = name;
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
}