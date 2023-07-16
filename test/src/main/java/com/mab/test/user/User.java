package com.mab.test.user;

public class User {

	private int id;

	private String name;

	private int point;

	private String userLevel;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, int point, String userLevel) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.userLevel = userLevel;
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

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
}