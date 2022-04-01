package dev.davilnv.entity;

import java.util.ArrayList;

public class Startup {
	private int id_startup;
	private String name;
	private String location;
	private int numberEmployers;
	private String investmentSeries;
	private ArrayList<Category> categories;
	
	public Startup(int id_startup, String name, String location, int numberEmployers, String investmentSeries) {
		super();
		this.id_startup = id_startup;
		this.name = name;
		this.location = location;
		this.numberEmployers = numberEmployers;
		this.investmentSeries = investmentSeries;
		this.categories = new ArrayList<>();
	}

	public int getId_startup() {
		return id_startup;
	}

	public void setId_startup(int id_startup) {
		this.id_startup = id_startup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumberEmployers() {
		return numberEmployers;
	}

	public void setNumberEmployers(int numberEmployers) {
		this.numberEmployers = numberEmployers;
	}

	public String getInvestmentSeries() {
		return investmentSeries;
	}

	public void setInvestmentSeries(String investmentSeries) {
		this.investmentSeries = investmentSeries;
	}

	public ArrayList<Category> getCategories() {
		return categories;
	}

	public void setCategories(Category category) {
		this.categories.add(category);
	}
	
}
