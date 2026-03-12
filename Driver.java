/*
 * Name: Gabriella Bruno
 * Project 1
 * Title: Driver.java
 * Description: grocery store uses product class to add an item, prints out information 
 * Date: 2/8/25
 * 
 */

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product oranges = new Product("Clementine", "1234", 1.25, 325);
		Product cereal = new Product("Lucky Charms", "5678", 5.79, 175);

		Scanner keyboard = new Scanner(System.in);
		
		Product object3 = new Product();

		System.out.println("Enter the name of the product:");
		object3.setName(keyboard.nextLine());
		
		System.out.println("Enter the SKU number of the product:");
		object3.setSKU(keyboard.next());
		
		while (	object3.isEqual(oranges) || object3.isEqual(cereal) ) {
			System.out.println("ERROR. Please enter a unique SKU number:");
			object3.setSKU(keyboard.next());
		}
		
		System.out.println("Enter the price of the product:");
		object3.setCost(keyboard.nextDouble());

		System.out.println("Enter the quantity of the product:");
		object3.setQuantity(keyboard.nextInt());
		
		System.out.println("Thank you for providing the necessary information!");
		System.out.println("**Creating a new product which is a copy of 'oranges'...");
		
		Product testProduct = new Product(oranges);

		System.out.println("Printing out information ...\n");

		System.out.println(oranges.toString() + "\n" + cereal.toString() + "\n" + object3.toString() + "\n" + testProduct.toString());
		
		System.out.println("**Updating quantity of 'testProduct' to 250...");
		testProduct.setQuantity(250);
		
		System.out.println("Printing out updated information...\n");
		System.out.println(oranges.toString() + "\n" + cereal.toString() + "\n" + object3.toString() + "\n" + testProduct.toString());

		System.out.println("The total number of unique products in the store is: " + Product.getTotalNumberOfProducts());
		System.out.println("Goodbye");
		
	}//end main
}//end class

/*
 * console output:
 * 
Enter the name of the product:
Chocolate Chips
Enter the SKU number of the product:
5678
ERROR. Please enter a unique SKU number:
4789
Enter the price of the product:
3.88
Enter the quantity of the product:
595
Thank you for providing the necessary information!
**Creating a new product which is a copy of 'oranges'...
Printing out information ...

Product Info: 
Product: Clementine
SKU Number: 1234
Cost: 1.25
Quantity: 325

Product Info: 
Product: Lucky Charms
SKU Number: 5678
Cost: 5.79
Quantity: 175

Product Info: 
Product: Chocolate Chips
SKU Number: 4789
Cost: 3.88
Quantity: 595

Product Info: 
Product: Clementine
SKU Number: 1234
Cost: 1.25
Quantity: 325

**Updating quantity of 'testProduct' to 250...
Printing out updated information...

Product Info: 
Product: Clementine
SKU Number: 1234
Cost: 1.25
Quantity: 325

Product Info: 
Product: Lucky Charms
SKU Number: 5678
Cost: 5.79
Quantity: 175

Product Info: 
Product: Chocolate Chips
SKU Number: 4789
Cost: 3.88
Quantity: 595

Product Info: 
Product: Clementine
SKU Number: 1234
Cost: 1.25
Quantity: 250

The total number of unique products in the store is: 4
Goodbye
 * 
 */