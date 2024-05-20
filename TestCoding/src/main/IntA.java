package main;

public interface IntA {

	default void setA() {
		System.out.println("In setA of IntA");
	}
}
