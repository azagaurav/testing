package com.test.java.bean;

public class Student {
	private String name;
	private Integer age;
	private String city;
	public Student(String name, String city, Integer age) {
		this.name =name;
		this.age = age;
		this.city = city;
	}

	

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}



	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}
	@Override
    public String toString() {
        return "Student [studentName=" + name + ", studentCity=" + city
                + ", studentAge=" + age + "]";
    }
}