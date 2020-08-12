package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Category implements Serializable{
  
	private String name;

	@Override
	public String toString() {
		return name ;
	}
	
	
}
