package dev.davilnv.entity;

public class Startup {
	private int id_startup;
	private String name;
	private String location;
	private int numberEmployers;
	private String investmentSeries;
	private String description;
	private String site;
	private int numberInvestors;
	private double totalFunding;
	private String categories = "";

	public Startup(int id_startup, String name, String location, int numberEmployers, String investmentSeries,
			String description, String site, int numberInvestors, double totalFunding) {
		super();
		this.id_startup = id_startup;
		this.name = name;
		this.location = location;
		this.numberEmployers = numberEmployers;
		this.investmentSeries = investmentSeries;
		this.description = description;
		this.site = site;
		this.numberInvestors = numberInvestors;
		this.totalFunding = totalFunding;
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
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getNumberInvestors() {
		return numberInvestors;
	}

	public void setNumberInvestors(int numberInvestors) {
		this.numberInvestors = numberInvestors;
	}

	public double getTotalFunding() {
		return totalFunding;
	}

	public void setTotalFunding(double totalFunding) {
		this.totalFunding = totalFunding;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String category) {
		this.categories = category;
	}
	
}
