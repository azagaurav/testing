package com.test.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "EMPLOYEE")

@NamedQueries({
	@NamedQuery(name="HQL_GET_ALL_EMPLOYEE", query = "from Employee"),
	@NamedQuery(name="HQL_GET_EMPLOYEE_BY_ID", query = "from Employee where emp_id = :id"),
	@NamedQuery(name="HQL_GET_EMPLOYEE_BY_SALARY", query = "from Employee where emp_salary > :salary")
})

@NamedNativeQueries({
    @NamedNativeQuery(name = "SQL_GET_ALL_EMPLOYEE", query = "select emp_id, emp_name, emp_salary from Employee"),
    @NamedNativeQuery(name = "SQL_GET_ALL_EMP_ADDRESS", query="select e.emp_id, e.emp_name, e.emp_salary, a.emp_id, a.address_line1, a.city, a.zipcode from Employee e join Address a ON e.emp_id=a.emp_id",
    resultSetMapping="joinMapping")

})
@SqlResultSetMapping(name="joinMapping", entities={
	    @EntityResult(entityClass=Employee.class, fields = {
	        @FieldResult(name="id", column="emp_id"),
	        @FieldResult(name="name", column="emp_name"),
	        @FieldResult(name="salary", column="emp_salary")
	    }),
	    @EntityResult(entityClass=com.test.java.model.Address.class, fields = {
	        @FieldResult(name="id", column="emp_id"),
	        @FieldResult(name="address_line1", column="address_line1"),
			@FieldResult(name="city", column="city"),
			@FieldResult(name="zipcode", column="zipcode"),
	    })
	    }
	)
/*
@NamedNativeQuery(name="night&area", query="select night.id nid, night.night_duration, "
	    + " night.night_date, area.id aid, night.area_id, area.name "
	    + "from Night night, Area area where night.area_id = area.id",
	                  resultSetMapping="joinMapping")
	@SqlResultSetMapping(name="joinMapping", entities={
	    @EntityResult(entityClass=Night.class, fields = {
	        @FieldResult(name="id", column="nid"),
	        @FieldResult(name="duration", column="night_duration"),
	        @FieldResult(name="date", column="night_date"),
	        @FieldResult(name="area", column="area_id"),
	        discriminatorColumn="disc"
	    }),
	    @EntityResult(entityClass=org.hibernate.test.annotations.query.Area.class, fields = {
	        @FieldResult(name="id", column="aid"),
	        @FieldResult(name="name", column="name")
	    })
	    }
	)*/


public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private long id;

	@Column(name = "emp_name")
	private String name;

	@Column(name = "emp_salary")
	private double salary;

	@OneToOne(mappedBy = "employee")
	@Cascade(value = org.hibernate.annotations.CascadeType.ALL)
	private Address address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Id= " + id + ", Name= " + name + ", Salary= " + salary
				+ ", {Address= " + address + "}";
	}

}
