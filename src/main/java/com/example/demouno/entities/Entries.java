package com.example.demouno.entities;

public class Entries {

	private String API;
	private String Description;
	private String Auth;
	private Boolean HTTPS;
	private String Cors;
	private String Link;
	private String Category;

	public String getAPI() {
		return API;
	}

	public void setAPI(String aPI) {
		this.API = aPI;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getAuth() {
		return Auth;
	}

	public void setAuth(String auth) {
		this.Auth = auth;
	}

	public Boolean getHTTPS() {
		return HTTPS;
	}

	public void setHTTPS(Boolean hTTPS) {
		this.HTTPS = hTTPS;
	}

	public String getCors() {
		return Cors;
	}

	public void setCors(String cors) {
		this.Cors = cors;
	}

	public String getLink() {
		return Link;
	}

	public void setLink(String link) {
		this.Link = link;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		this.Category = category;
	}

}
