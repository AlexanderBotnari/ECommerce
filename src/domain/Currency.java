package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Currency implements Serializable{

	public static Currency baseCurrency = new Currency (
	        "EUR",
	         1.00         
	    ); 

	    private String code;       // e.g. "EUR"
	    private double rate;       // rate based on baseCurrency
	   
	    // get/set+constructors+toString 
	
}
