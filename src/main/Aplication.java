package main;

import java.util.List;

import com.github.javafaker.Faker;

import domain.Cart;
import domain.Money;
import domain.Product;
import domain.ProductFactory;

public class Aplication {

	public static void main(String[] args) {
		
	    ProductFactory.getInstance();
		Product product = ProductFactory.getProduct("Iphone 7", new Money("$",300f), 2,
	    		new Faker().date().birthday(1, 10) ,"USA", "Phones");
		
		ProductFactory.getInstance();
		Product product1 = ProductFactory.getProduct("Iphone 11 pro",new Money("$",1000f) , 4,
	    		new Faker().date().birthday(1, 10) ,"FSA", "Phones");
		
		ProductFactory.getInstance();
		List<Product> fakeProducts = ProductFactory.getManyFakeProducts(5);
		
		ProductFactory.getInstance();
		Product fakeProduct = ProductFactory.getFakeProduct();
		 
        Cart.getInstance().add(product);
        Cart.getInstance().add(product1);
        Cart.getInstance().add(fakeProduct);
        
        fakeProducts.forEach(p -> Cart.getInstance().add(p));
        
//        System.out.println(Cart.getInstance().findByManufacturer("USA"));
//        System.out.println(Cart.getInstance().findByName("Iphone 11 pro"));
//        System.out.println(Cart.getInstance().findByCategory("Phones"));
//        Cart.getInstance().calculateTotal();
//        System.out.println("Total - "+Cart.getInstance().getTotal());
//        
//        System.out.println(Cart.getInstance().findAll());
        Money priceInEuro = new Money( "EUR" , 1000f);
        Money samePriceInLei = priceInEuro.toCurrency( "MDL" );
        System.out.println(samePriceInLei);
	}
	

}
