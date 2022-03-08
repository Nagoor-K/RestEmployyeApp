package com.nagoor.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Employee {
	@Id
	private long id;
	private String name;
	private int age;
	private long salary;
	
	
	
  public Employee() {
    super();
  }
  
public Employee(long id, String name, int age, long salary) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
public long getId() {
  return id;}
  public void setId(long id) {
  this.id = id;}
  public String getName() {
  return name;}
  public void setName(String name) {
  this.name = name;}
  public int getAge() {
  return age;}
  public void setAge(int age) {
  this.age = age;}
  public long getSalary() {
  return salary;}
  public void setSalary(long salary) {
  this.salary = salary;}

@Override 
public String toString(){return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";}
	
	
  
}
