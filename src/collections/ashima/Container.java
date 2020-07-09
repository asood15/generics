package collections.ashima;

import java.util.List;

public class Container<T> {

	T variable;
	
	public T getValue() {
		return variable;
	}

	public void setValue(T value) {
		this.variable = value;
	}

	public void show() {
		System.out.println("Variable is of type " + variable.getClass().getCanonicalName() + " with value is " + variable);
	}
	
	public void printNumbers(List<? extends T> numList) {
		for (int i=0; i< numList.size(); i++) {
			System.out.println(i + " ---> " +  numList.get(i));
		}
	}

}
