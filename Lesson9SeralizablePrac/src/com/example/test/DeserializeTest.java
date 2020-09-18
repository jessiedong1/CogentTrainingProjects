package com.example.test;

import com.example.domain.Item;
import com.example.domain.ShoppingCart;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class DeserializeTest {

    public static void main(String[] args) {
        String directory = "/Users/jessiedong/Documents/Cogent_Training/SecondWeek/08_25/";
        String cartId = null;
        System.out.println("Enter the ID of the cart file to deserialize or q exit.");
        // Wrap the System.in InputStream with a BufferedReader to read
        // each line from the keyboard.
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = in.readLine();
            if (cartId.equals("q")) {
                System.exit(0);
            }
        } catch (IOException e) { // Catch any IO exceptions.
            System.out.println("Exception: " + e);
            System.exit(-1);
        }

        // Attempt to open the file and deserialize it into an object
        String cartFile = directory + "cart" + cartId + ".ser";
        ShoppingCart cart = null;
        // Your code goes here....
        long date = 0;
	
		try (
			FileInputStream fos = new FileInputStream(cartFile);
			ObjectInputStream oos = new ObjectInputStream(fos))
			
		{
			cart = (ShoppingCart)oos.readObject();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String pattern = "MMMM dd, yyyy";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		
//		System.out.println("Resorted Shopping Cart from: " + sdf.format(cart.getDateShopped()));
//		System.out.println("Resorted Shopping Cart from: " + date);
		System.out.println("Successfully deserialized shopping cart with ID: " + cart.getCartID());
		System.out.println("Shopping cart contains: ");
		List<Item> cartContents = cart.getItems();
		for(Item item: cartContents) {
			System.out.println(item);
		}
		System.out.println("Shopping cart total:	"+ NumberFormat.getCurrencyInstance().format(cart.getCartTotal()));


    }
}