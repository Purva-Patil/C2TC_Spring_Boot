package com.sms.mall.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee{

	
	@Id
    private Integer id;
	private String name;
	private LocalDate dob;
	private Float salary;
	private String address;
	private String designation;
	private String shop_id;
	
	public Employee()
	{	
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary= salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getShopId() {
		return shop_id;
	}

	public void setShopId(String shop_id) {
		this.shop_id = shop_id;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob +",salary=" + salary + ", address=" + address + ", designation" + designation +", shop_id=" + shop_id +"]";
	}
}