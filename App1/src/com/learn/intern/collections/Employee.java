package com.learn.intern.collections;

public class Employee {
	private int eId;
	private int eAge;
	private String eName;
	public Employee(int eId, int eAge, String eName) {
		super();
		this.eId = eId;
		this.eAge = eAge;
		this.eName = eName;
	}
	public Employee() {
		super();
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eAge=" + eAge + ", eName=" + eName + "]";
	}
	

}
