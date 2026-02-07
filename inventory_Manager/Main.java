package inventory_Manager;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		InventoryManager manager = new InventoryManager();
		boolean on = true;
		
		while (on) {
			System.out.print("\n=== Inventory Manager ===\r\n"
					+ "\r\n"
					+ "1. Add Product\r\n"
					+ "2. View All Products\r\n"
					+ "3. Search Product\r\n"
					+ "4. Update Product\r\n"
					+ "5. Delete Product\r\n"
					+ "0. Exit\r\n"
					+ "\r\n"
					+ "Choose option: ");
			
			String choice = input.nextLine();
			
			if (choice.equals("1")) {
				try {
				System.out.print("Enter product (id name price quantity): ");
				String line = input.nextLine();
				String[] lineparts = line.split("\\s+");
				
				int id = Integer.parseInt(lineparts[0]);
				String name = lineparts[1];
				float price = Float.parseFloat(lineparts[2]);
				int quantity = Integer.parseInt(lineparts[3]);
				
				manager.addProduct(id, name, price, quantity);
				}
				catch (Exception e) {
					System.out.print("Invalid adding format.\n\n");
				}
			}
			
			else if (choice.equals("2")) {
				
				if (manager.productList.isEmpty()) {
					System.out.print("No products have been added. \n\n");
					continue;
				}
				
				System.out.print("Here is a list of all products: \n");
				System.out.print(manager.listAllProducts());
			}
			
			else if (choice.equals("3")) {
				try {
					System.out.print("Type the id of the product to search:  \n");
					String id = input.nextLine();
					System.out.print(manager.findByID(Integer.parseInt(id)));
				}
				catch (Exception e) {
					System.out.print("Invalid id.\n\n");
				}
			}
			
			else if (choice.equals("4")) {
				try {
					manager.listAllProducts();
					System.out.print("Enter: id newPrice newQuantity: ");
					String line = input.nextLine();
					String[] lineparts = line.split("\\s+");
					
					int id = Integer.parseInt(lineparts[0]);
					float price = Float.parseFloat(lineparts[1]);
					int quantity = Integer.parseInt(lineparts[2]);
					
					manager.updateProduct(id, price, quantity);
				}
				catch (Exception e) {
					System.out.print("Invalid updating format.\n\n");
				}
			}
			
			else if (choice.equals("5")) {
				try {
					manager.listAllProducts();
					System.out.print("Choose product to delete by typing its id: ");
					String id = input.nextLine();
					
					manager.removeProduct(Integer.parseInt(id));
				}
				catch (Exception e) {
					System.out.print("Invalid id.\n\n");
				}
			}
			
			else if (choice.equals("0")) {
				System.out.print("Application terminated.");
				break;
			}
			
			else {
				System.out.print("Invalid option.\n\n");
			}
			
		}
			
		input.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
