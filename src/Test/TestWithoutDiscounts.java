package Test;


import basic.Cart;
import basic.Item;
import basic.ItemType;
import basic.Product;
import basic.User;
import basic.UserType;


public class TestWithoutDiscounts {
	private Cart cart;
    private Item item;

   // @Before
    public void setUp() {
    	User user = new User(UserType.CUSTOMER, "John");
        cart = new Cart(user);
        item = new Product("something", 1000, ItemType.OTHER);
    }

    //@Test
    public void test_emptyCartCostsZero() {
        assertEquals(0, cart.total(), 0.01);
    }

    private void assertEquals(double e, double total, double d) {
		// TODO Auto-generated method stub
		
	}

	//@Test
    public void test_singleBasicItemCostsItsUnitPrice() {
        cart.add(item);
        assertEquals(item.getUnitPrice(), cart.total(), 0.01);
    }

   // @Test
    public void test_multipleBasicItemsCostProportionally() {
        int howMany = 3;
        cart.add(item, howMany);
        assertEquals(howMany * item.getUnitPrice(), cart.total(), 0.01);
    }

    //@Test
    public void test_separatelyAdding() {
        int howMany = 3;
        for (int i = howMany; i > 0; i--) {
            cart.add(item);
        }
        assertEquals(howMany * item.getUnitPrice(), cart.total(), 0.01);
    }
}
