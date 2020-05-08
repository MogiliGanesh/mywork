package com.qa.Data;

//PoJo  >> plain old java object

public class Users {

	String Name;
	String Job;
	String id;
	String CreatedAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(String createdAt) {
		CreatedAt = createdAt;
	}

	public Users() {

	}

	public Users(String Name, String Job,String CreatedAt, String id) {
		this.Name = Name;
		this.Job = Job;
		this.CreatedAt=CreatedAt;
		this.id=id;
	}

	public String getName() {
		return Name;
	}

//getter and setter method  >>>>>r/click>>Source >> generate getter setter

	public void setName(String name) {
		Name = name;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

}
