package inventory_Manager;
import java.util.ArrayList;

public class InventoryManager {
	
	ArrayList<Product> productList = new ArrayList<Product>();
	
	public void addProduct (int id, String name, float price, int quantity) {
		
		for (int i=0; i< productList.size(); i++) {
			if (id == productList.get(i).getId()) {
				System.out.print("ID already in use.\n\n");
				return;
			}
		}
		
		if (price <= 0) {
			System.out.print("Invalid price range.\n\n");
			return;
		}
		if (quantity <= 0) {
			System.out.print("Invalid quantity range.\n\n");
			return;
		}
		
		Product product = new Product (id, name, price, quantity);
		productList.add(product);
		System.out.print("Product added.\n\n");
	}
	
	public void removeProduct (int id) {
		boolean found = false;
		for (int i=0; i< productList.size(); i++) {
			if (id == productList.get(i).getId()) {
				found = true;
				productList.remove(i);
				System.out.print("Product removed.\n\n");
			}
		}
		
		if (!found) {
			System.out.print("Product does not exist.\n\n");
		}
		
	}
	
	public String findByID (int id) {
		boolean found = false;
		String result = "";
		
		for (int i=0; i< productList.size(); i++) {
			if (id == productList.get(i).getId()) {
				result = "Your Item Details: \n" + productList.get(i).toString() + "\n";
				found = true;
			}
		}
		if (found) {
			return result;
		}
		else {
			return "No item found with that id.\n\n";
		}
	}
	
	public void updateProduct (int id, float price, int quantity) {
		for (int i=0; i< productList.size(); i++) {
			if (id == productList.get(i).getId()) {
				productList.get(i).setPrice(price);
				productList.get(i).setQuantity(quantity);
				System.out.print("Product updated.\n\n");
			}
		}
	}
	
	
	public String listAllProducts() {
		String result = "";
		for (int i=0; i< productList.size(); i++) {
			result = productList.get(i).toString() + "\n\n" + result;
		}
		return result;
	}
	
	
	
}
