package com.maven.springmvc.dao;

//create this class to reflect the tables in database
//All variables are the name of each column in the table
public class Porject {

	private int id;
	private String name;
	private int no;
	
	public Porject(){
		
	}
	
	public Porject(int id, String name, int no) {
		
		this.id = id;
		this.name = name;
		this.no = no;
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
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Porject [id=" + id + ", name=" + name + ", no=" + no + "]";
	}
	
	
}
