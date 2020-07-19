package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Category {
  
	private String name;

	@Override
	public String toString() {
		return name ;
	}
	
	
}
