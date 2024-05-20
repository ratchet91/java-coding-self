package main;

public interface IntB {

	default void setA() {
		System.out.println("In setA of IntB");
	}
}
