package collections.ashima;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		Container<Object> c = new Container<>();

		// assign an int
		c.variable = 100;
		c.show();

		// assign a float
		c.variable = 3.14;
		c.show();

		// assign a string
		c.variable = "Welcome";
		c.show();


		List<Integer> intArr = new ArrayList<>();
		intArr.add(10);
		intArr.add(2);
		c.printNumbers(intArr);
		
		List<String> strArr = new ArrayList<>();
		strArr.add("Welcome to Berlin");
		strArr.add("Welcome to London");
		c.printNumbers(strArr);
	}
}
