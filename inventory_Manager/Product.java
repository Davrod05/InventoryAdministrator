package inventory_Manager;

public class Product {
	
//properties of product
	private int id = 0;
	private String name = "";
	private float price = 0;
	private int quantity = 0;
	
//product constructor
	public Product (int id, String name, float price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

//Getters and Setters for properties of product obj
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//overrides normal toString
	public String toString() {
		
		return "ID: " + this.id +"\n"+ "Name: " + this.name +"\n"+ "Price: " + this.price +"\n"+ "Quantity: " + this.quantity ;
	}
	
	
	
	
	
	
	
}