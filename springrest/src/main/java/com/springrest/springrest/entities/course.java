package com.springrest.springrest.entities;

public class course {

	
	private long id;
	private String titles;
	private String description;
	public course(long id, String titles, String description) {
		super();
		this.id = id;
		this.titles = titles;
		this.description = description;
	}
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitles() {
		return titles;
	}
	public void setTitles(String titles) {
		this.titles = titles;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
