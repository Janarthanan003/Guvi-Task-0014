package com.example.hrtest;
import com.example.hr.*;
public class EmployeeTest {
	public static  void main(String[] args) {
		Employee obj = new Employee();
		obj.setName("Joe");
		obj.setId(11);
		obj.setSalary(50000);
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
	}
}
