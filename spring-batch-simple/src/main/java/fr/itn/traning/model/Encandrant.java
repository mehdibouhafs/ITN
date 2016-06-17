package fr.itn.traning.model;

public class Encandrant {
	private Long id;
	private String name;
	private int age;
	private Campany campany;
	
	public Encandrant() {
		// TODO Auto-generated constructor stub
	}
	
	public Encandrant(Long id, String name, int age, Campany campany) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.campany = campany;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Campany getCampany() {
		return campany;
	}

	public void setCampany(Campany campany) {
		this.campany = campany;
	}

	@Override
	public String toString() {
		return "Encandrant [id=" + id + ", name=" + name + ", age=" + age + ", campany=" + campany + "]";
	}
	
	
}
