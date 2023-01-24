package Neha.Oracle.service;

import Neha.Oracle.Dao.EmployeeDao;

public class EmployeeService {

	public static void main(String[] args) {
		
		EmployeeDao empDao = new EmployeeDao();
		int empId=1005;
		String name = "naini";
		float salary = 112233.44f;		
		empDao.insertEmployee(empId, name, salary);

	}

}
