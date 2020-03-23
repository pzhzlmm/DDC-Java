package com.atguigu.exer3;

class CommonEmployee extends Employee {
	public CommonEmployee() {
	}

	public CommonEmployee(String name, int id, double salary) {
		super(name, id, salary);
	}

	public void work() {
		System.out.println("员工工作");
	}

	@Override
	public String toString() {
		return "CommonEmployee [name=" + getName() + ", id=" + getId() 
		+ ", salary=" + getSalary() + "]";
	}

	
}
