package by.academy.lesson7.oop.classwork.deal;

public class Product {
	private String name;
	protected String type;
	private double cost;

	public Product() {
		super();
	}

	public Product(String name, String type, double cost) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
