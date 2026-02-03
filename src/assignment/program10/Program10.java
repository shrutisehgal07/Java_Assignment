/*
 Class name: Product
Fields: id, name, price, gst (in %), available_quantity
Initialize above from a txt/dat file into an array of Product.
Format of file:
<id> <name> <price> <gst> <available_quantity>
Write a menu driven program to let customers select products until he selects the
Checkout option and then show the total amount he has to pay after calculating the GST.

 */

package assignment.program10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Program10 {
	
public static void main(String[] args) throws FileNotFoundException {
		
	
		File file= new File("src/text/product");
		Scanner sc = new Scanner(file);
		Product[] arr=new Product[3];
		int i=0;
		while(sc.hasNextLine()) {               // reading a line of a file
			Product obj=new Product();             
			String str=sc.nextLine();            //  converting the text into string
			String[] nstr=str.split("\\s+");        // using split (regex)  we convert it into an array. 
			obj.id=Integer.parseInt(nstr[0]);          //converts string to int
			obj.name=nstr[1];  
			obj.price=Double.parseDouble(nstr[2]);
			obj.gst=Double.parseDouble(nstr[3]);
			obj.quantity=Integer.parseInt(nstr[4]);
			arr[i++]=obj;
		}
		
		
		
		
		System.out.println("Welcome to the Application");
		
		Scanner input = new Scanner(System.in);
		double total=0;
		
		int ch;
		
		
		do {
			for(Product p: arr) {
				System.out.print( " ID: " + p.id +" ");
				//System.out.print("   ");
				System.out.print(" Name: " + p.name +" ");
				System.out.print(" Price: " + p.price +" ");
				System.out.print(" GST: " + p.gst + "% ");
		        System.out.println(" Quantity left: " + p.quantity);        
			}
			
			System.out.println("1.Select Product");
            System.out.println("2. Checkout");
            
            System.out.print("Enter choice: ");
            ch = input.nextInt();

            if (ch == 1) {
                System.out.print("Enter the product id: ");
                int prodId = input.nextInt(); 

                int idx = -1;                            // for product not found
                for (i = 0; i < arr.length; i++) {
                    if (arr[i].id == prodId) {                   
                        idx = i;
                        break;
                    }
                }

                if (idx != -1) {
                    System.out.print("Enter the quantity: ");
                    int q = input.nextInt();

                    if (q <= arr[idx].quantity) {
                        double amount = arr[idx].calculateTotal(q);
                        arr[idx].quantity -= q;
                      //  double ftotal= total;
                        total = total+ amount;
                        System.out.println("Product is selected, amount with GST is: " + amount);
                    } 
                    
                    else {
                        System.out.println("Quantity exceeded");
                    }
                }
            } 
            else if (ch == 2) {
                System.out.println("Checkout");
                System.out.println("Total Amount to be paid: " + total);
            }
            
            else {
                System.out.println("Invalid choice!");
            }

        } 
		while (ch != 2);
		
		input.close();
		sc.close();
	
		

}
}
