package javaDemo;

public class Hello {

	public static void main (String []args) {
		System.out.print("Hello world \n");
		
		Employee tom = new Employee("tom");
		tom.empAge(25);
		tom.empSalary(1000.00);
		tom.printInfor();
		
		Employee.func();
		
		
		String[] names = {"one", "two", "three" };
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	final double money = 500.00;
	
}
