package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Money {

	private String currency;
	private Float  amount;
	
	@Override
	public String toString() {
		return "Currency '" + currency+"' "+ ", amount : " + amount;
	}
	
	
}
