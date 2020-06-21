package com.loto.io.c.charstream.a.BufferedWriter;

// 创建学生类，用来描述学生信息
public class Student {
	private String id; // 学号
	private String name;// 姓名
	private String age;// 年龄
	private String address;// 居住地

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String id, String name, String age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student() {
		super();
	}
}
