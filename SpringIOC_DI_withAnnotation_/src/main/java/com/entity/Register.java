package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("R1")
public class Register {
	@Value("1")
	private int id;
	@Value("Shiva")
	private String name;
	@Value("Nanded")
	private String Adress;
	@Autowired
    //@Autowired(required=false)
	private Login log;

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Register(int id, String name, String Adress, Login log) {
		super();
		this.id = id;
		this.name = name;
		this.Adress = Adress;
		this.log = log;
	}

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
		this.name = name;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String Adress) {
		this.Adress = Adress;
	}

	public Login getLog() {
		return log;
	}

	public void setLog(Login log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", Adress=" + Adress + ", log=" + log + "]";
	}

}