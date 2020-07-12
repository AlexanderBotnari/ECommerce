package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.github.javafaker.Faker;

public class ProductFactory {

	
	public  static Product getProduct(String name, Money price, Integer quantity, Date expiration, 
			                          String manufactured, Category category) {

        return new Product(name, price, quantity, expiration , manufactured, category);
    }
	
	 public static Product getFakeProduct() {
		 Faker faker = new Faker();
	        return new Product(
	                faker.commerce().productName(),
	                new Money(faker.currency().code(), (float)faker.number().numberBetween(50, 10000)),
	                faker.number().numberBetween(1, 30),
	                faker.date().birthday(1, 120),
	                faker.country().name(),
	                new Category(faker.commerce().department()));
	    }
	 
	 public static List<Product> getManyFakeProducts(Integer quantity) {
		 
	        List<Product> products = new ArrayList<>();
	        
	        while (products.size() < quantity){
	            products.add( getFakeProduct());
	        }
	        return products;
	    }
}
