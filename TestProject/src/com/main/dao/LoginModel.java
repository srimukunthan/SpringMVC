package com.main.dao;

public class LoginModel {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "LoginModel [id=" + id + ", name=" + name + "]";
	}
	public LoginModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static class ComputerBuilder{
		 
        // required parameters
        private int id;
        private String name;
		public void setId(int id) {
			this.id = id;
		}
		public ComputerBuilder setName(String name) {
			this.name = name;
			return this;
		}
        
        
        
	
	
	}

}
