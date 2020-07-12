package domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Product {
    
	private String   name;
	private Money    price;
	private Integer  quantity;
	private Date     expiration;
	private String   manufactured;
	private Category category;
	
	@Override
	public String toString() {
		return "Product Name : " + name + "\nPrice : " + price + "\nQuantity : " + quantity + "\nExpiration : " + expiration
				+ "\nManufactured : " + manufactured + "\nCategory : " + category;
	}
	
	
	
}
