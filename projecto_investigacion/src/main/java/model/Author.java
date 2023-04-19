package model;

public class Author {
	private String id;
	private String name;
	private String affiliation;
	private String email;
	
	
	public Author() {

	}


	public Author(String id, String name, String affiliation, String email) {
		super();
		this.id = id;
		this.name = name;
		this.affiliation = affiliation;
		this.email = email;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAffiliation() {
		return affiliation;
	}


	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
