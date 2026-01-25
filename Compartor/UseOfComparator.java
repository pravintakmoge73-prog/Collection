/*Q7. Create a Product class with fields:
int id, String name, double price, and int quantity.
. Implement two Comparators: one for sorting by price, and another for
sorting by quantity.
. In the main method:
Add at least 5 products to an ArrayList.
Sort and display the list by price (ascending).
Then sort and display by quantity (descending).
Find and display the product with the maximum price.
*/

import java.util.*;
class Product
{
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	Product(int id, String name, double price, int quantity)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
}
class SortByPrice implements Comparator//<Product>
{
	public int compare(Object o1, Object o2)
	{
		Product first = (Product)o1;
		Product second= (Product)o2;
		if(first.getPrice()>second.getPrice())
			return 1;
		else if(first.getPrice() < second.getPrice())
			return -1;
		else
			return 0;
		//public int compare(Product first, Product second) {
        //return Double.compare(first.getPrice(), second.getPrice());
	}
}

class SortByQuantity implements Comparator//<Product>
{
	public int compare(Object o1, Object o2)
	{
		Product first = (Product)o1;
		Product second = (Product)o2;
		if(second.getQuantity() > first.getQuantity())
			return 1;
		else if(second.getQuantity() < first.getQuantity())
			return -1;
		else
			return 0;
		
	}
}

public class UseOfComparator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1, "E", 20, 3));
		list.add(new Product(2, "D", 40, 5));
		list.add(new Product(3, "C", 30, 8));
		list.add(new Product(4, "B", 60, 2));
		list.add(new Product(5, "A", 50, 4));
		
		System.out.println("Product detail in before Sorting :");
		for(Product p : list)
		{
			System.out.println("Id : "+p.getId()+" Name : "+p.getName()+" Price : "+p.getPrice()+" Quantity : "+p.getQuantity());
		}
		
		System.out.println("Product Details After Sorting BY Price :");
		Comparator c = new SortByPrice();
		Collections.sort(list,c);
		for(Product p: list)
		{
			System.out.println("Id : "+p.getId()+" Name : "+p.getName()+" Price : "+p.getPrice()+" Quantity : "+p.getQuantity());
		}
		
		System.out.println("Product Details After Sorting BY Quantity :");
		 c = new SortByQuantity();
		Collections.sort(list,c);
		for(Product p : list)
		{
			System.out.println("Id : "+p.getId()+" Name : "+p.getName()+" Price : "+p.getPrice()+" Quantity : "+p.getQuantity());
		}
		
		System.out.println("Product details that has max Price :");
		Product max = list.get(0);
		
		for(Product p: list)
		{
			if(p.getPrice() > max.getPrice())
			{
				max = p;
			}
		}
		
		System.out.println("Id : "+max.getId()+" Name : "+max.getName()+" Price : "+max.getPrice()+" Quantity : "+max.getQuantity());
		
	}
}