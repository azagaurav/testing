package com.test.hiber;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.helper.HibernateUtils;
import com.test.java.model.Address;
import com.test.java.model.Employee;

public class NamedQueryEx {
	public static void main(String[] str) {

		System.out.println("Hello World!");


		// Prep work
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		//HQL Named Query Example
		Query query = session.getNamedQuery("HQL_GET_ALL_EMPLOYEE");
		List<Employee> empList = query.list();
		for (Employee emp : empList) {
			System.out.println("List of Employees::" + emp.getId() + ","
					+ emp.getAddress().getCity());
		}

		query = session.getNamedQuery("HQL_GET_EMPLOYEE_BY_ID");
		query.setInteger("id", 2);
		Employee emp = (Employee) query.uniqueResult();
		System.out.println("Employee Name=" + emp.getName() + ", City="
				+ emp.getAddress().getCity());

		query = session.getNamedQuery("HQL_GET_EMPLOYEE_BY_SALARY");
		query.setInteger("salary", 200);
		empList = query.list();
		for (Employee emp1 : empList) {
			System.out.println("List of Employees::" + emp1.getId() + ","
					+ emp1.getSalary());
		}

		query = session.getNamedQuery("@HQL_GET_ALL_ADDRESS");
		List<Address> addressList = query.list();
		for (Address addr : addressList) {
			System.out.println("List of Address::" + addr.getId() + "::"
					+ addr.getZipcode() + "::" + addr.getEmployee().getName());
		}
		
		//Native SQL Named Query Example
		query = session.getNamedQuery("@SQL_GET_ALL_ADDRESS");
		List<Object[]> addressObjArray = query.list();
		for(Object[] row : addressObjArray){
			for(Object obj : row){
				System.out.print(obj + "::");
			}
			System.out.println("\n");
		}
		query = session.getNamedQuery("SQL_GET_ALL_EMP_ADDRESS");
		addressObjArray = query.list();
		for(Object[] row : addressObjArray){
			Employee e = (Employee) row[0];
			System.out.println("Employee Info::"+e);
			Address a = (Address) row[1];
			System.out.println("Address Info::"+a);
		}
		// rolling back to save the test data
		tx.commit();

		// closing hibernate resources
		sessionFactory.close();
	}
}