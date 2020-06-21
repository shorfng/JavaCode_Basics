package com.loto.collections.a3.hashset;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	// 重写hashCode
	public int hashCode() {
		return name.hashCode() + age * 55;
	}

	// 重写父类方法equals,保证和父类相同
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (obj instanceof Person) {
			Person p = (Person) obj;
			return name.equals(p.name) && age == p.age;
		}
		return false;
	}

	public String toString() {
		return name + ".." + age;
	}
}
