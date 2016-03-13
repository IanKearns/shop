package shop.customer;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity//creates table
public class Customer {
	private String name;
	private String Age;
	private String Address;


	@Id
	@GeneratedValue//will create auto increment
	private int id;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("set name "+name);
		this.name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", Age=" + Age + ", Address=" + Address + ", id=" + id + "]";
	}

}
