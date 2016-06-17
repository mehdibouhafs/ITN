package fr.itn.traning.model;

public class Campany {
	private String name;
	
	public Campany() {
		// TODO Auto-generated constructor stub
	}
	
	public Campany(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Campany [name=" + name + "]";
	}
	
	
}
