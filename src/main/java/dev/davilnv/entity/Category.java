package dev.davilnv.entity;

public class Category {
	private int id_category;
	private String description;
	
	public Category(int id_category, String description) {
		super();
		this.id_category = id_category;
		this.description = description;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
