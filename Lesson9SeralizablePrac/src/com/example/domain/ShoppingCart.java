package com.example.domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 23L;
    private int cartID;
    private ArrayList<Item> items;
    private int itemCount;
    private transient double cartTotal;

    public ShoppingCart(int custID) {
        this.cartID = custID;
        items = new ArrayList<>();
        itemCount = 0;
        cartTotal = 0;
//        dateShopped = new Date();
        
    }
	public double getCartTotal() {
        return cartTotal;
    }

    public int getCartID() {
        return cartID;
    }

    public void addItem(Item i) {
        if (items.add(i)) {
            cartTotal += i.getCost();
        }
    }

    public int getCartSize() {
        return items.size();
    }

    public List<Item> getItems() {
        return items;
    }
    private void writeObject(ObjectOutputStream oos) throws ClassNotFoundException, IOException {
   
		oos.defaultWriteObject();
		oos.writeObject(new Date());
		
	}
    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException 
    {       
        ois.defaultReadObject();
//        ois.readLong();
//        this.dateShopped = new Date(ois.readLong());
        this.cartTotal = this.items.stream().mapToDouble(t->t.getCost()).sum();
//        for(Item item:this.items)
//        	cartTotal += item.getCost();
        Date date = (Date) ois.readObject();
		String pattern = "MMMM dd, yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("Resorted Shopping Cart from: " + sdf.format(date));
    }
    
}