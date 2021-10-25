import basic.*;
import discount.*;



package Test;

public class Main {

	public static void main (String[] args)
    {
    	User employee = new User(UserType.AFFILIATE, "John");
        Item groceryItem = new Product("Rice", 20, ItemType.GROCERY);
        Item otherItem = new Product("TV", 222, ItemType.OTHER);
        DiscountPolicy discountPolicy = new BasicDiscount();
        
        Cart cart = new Cart(employee, discountPolicy);
        cart.add(groceryItem, 4);
        cart.add(otherItem, 4);
        /*
         *  Total (20 * 4) + (222 * 4) = 968
         *  No discount on grocery items = 968 still
         *  After 30% discount on 4 other items totalling 888 = 701.6
         *  After 35 dollars off due to price over $700 = 666.59999 or 666.6 
         */
        System.out.println(cart.total());        
    }
	
}
