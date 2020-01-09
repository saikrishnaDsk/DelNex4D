package com.myhib.service;

import java.util.List;

import com.myhib.dao.EmployeeDao;
import com.myhib.model.Employee;


public class EmployeeService {

	public static void main(String[] args) {
		Employee emp = new Employee(6, "Sam", 23, "Marketing", "Hyderabad");

		EmployeeDao dao=new EmployeeDao();
		
		dao.saveEmployee(emp);
		List<Employee> em = dao.getEmployeebyAge();
		for(Employee l:em) {
			System.out.println(l);
		}
		
		List<Employee> em1 = dao.getEmployeebyAgeCity();
		for(Employee l:em1) {
			System.out.println(l);
		}
		List<Employee> em2 = dao.getEmployeebyCity();
		for(Employee l:em2) {
			System.out.println(l);
		}
		List<Employee> em3 = dao.getEmployeebyAgeDep();
		for(Employee l:em3) {
			System.out.println(l);
		}
		List<Employee> em4 = dao.getEmployeebyDep();
		for(Employee l:em4) {
			System.out.println(l);
		}
		
	}

}
