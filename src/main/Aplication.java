package main;

import com.github.javafaker.Faker;

import domain.Category;
import domain.Money;
import domain.ProductFactory;

public class Aplication {

	public static void main(String[] args) {
		
		System.out.println(ProductFactory.getProduct("Iphone 7 BlackJet",new Money("$",300f),1,
				new Faker().date().birthday(1, 10), "USA" , new Category("Phones")));
        System.out.println();
        System.out.println(ProductFactory.getFakeProduct());
        System.out.println();
        ProductFactory.getManyFakeProducts(3).forEach(p -> System.out.println(p));

	}
	

}
