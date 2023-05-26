package com.example.demouno.entities;

public class EntityResponse {

	private Integer count;

	private Entries[] entries;

	public EntityResponse() {
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Entries[] getEntries() {
		return entries;
	}

	public void setEntries(Entries[] entries) {
		this.entries = entries;
	}

}
