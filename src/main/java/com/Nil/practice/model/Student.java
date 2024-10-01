package com.Nil.practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	
	private String name;
	
	private String sadd;
	
	private int srank;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public int getSrank() {
		return srank;
	}

	public void setSrank(int srank) {
		this.srank = srank;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", sadd=" + sadd + ", srank=" + srank + "]";
	}
	
	

}
