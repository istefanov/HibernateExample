package test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import pojo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Employee.class);
		cfg.configure();
		
		new SchemaExport(cfg).create(true, true);
	}

}
