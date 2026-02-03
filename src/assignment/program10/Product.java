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

class Product{
	int id;
	String name;
	double price;
	double gst;
	int quantity;
	
	Product(){
		
	}
		
	Product(int id, String name, double price, double gst, int quantity){
		this.id=id;
		this.name=name;
		this.price= price;
		this.gst=gst;
		this.quantity=quantity;
		}
	
	public double calculateTotal(int quan){
        double total = price*quan;
        return total + (total  * gst/100);
        
    }
	}

