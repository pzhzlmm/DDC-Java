package com.atguigu.exer3;

class Manager extends Employee {
	private int bonus;

	public Manager() {

	}

	public Manager(String name, int id, double salary) {
		super(name, id, salary);
	}

	public Manager(String name, int id, double salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}

	public void work() {
		System.out.println("经理管理普通员工的工作");
	}
}
