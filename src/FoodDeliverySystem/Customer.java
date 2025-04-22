package FoodDeliverySystem;

import java.util.ArrayList;

public class Customer {
	public String name;
	public ArrayList<String> orderList=new ArrayList<String>();
	public Customer(String name) {
		super();
		this.name = name;
	}
	int i=0;
	public void placeOrder(String item) throws OrderLimitException {
		if(i<5) {
			orderList.add(item);
			i++;
		} else {
			throw new OrderLimitException("Cart is Full");
		}
	}
	public boolean hasItem(int orderNo) throws MenuNotFoundException {
		if(orderNo<5) {
			return true;
		} else {
			return false;
		}
	}
}
