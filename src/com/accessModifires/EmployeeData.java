
/* To access the get and set methods, the employee object can be created */

package com.accessModifiers;

public class EmployeeData {
	public static void main(String args[]) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Atharva");
		e.setCity("Baramati");
		e.setAge(22);
		
		System.out.println("Employee Id : "+e.getId());
		System.out.println("Employee Name : "+e.getName());
		System.out.println("Employee City : "+e.getCity());
		System.out.println("Employee Age : "+e.getAge());
	}
}
