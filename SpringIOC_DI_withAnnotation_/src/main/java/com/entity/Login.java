package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//component
public class Login {
	@Value("1")
	private int id;
	@Value("234")
	private int pass;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(int id, int pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", pass=" + pass + "]";
	}
	
}
