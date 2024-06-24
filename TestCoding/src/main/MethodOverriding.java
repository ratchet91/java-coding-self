package main;

class A {
	public void method1() {
		System.out.println("Hi Welcome to method1 of class A");
	}

	protected void method2() {
		System.out.println("Hi Welcome to method12 of class B");
	}
}

class B extends IntA {
	public void method1() {
		super.method2();
		System.out.println("Hi Welcome to method1 of class B");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntA a = new IntA();
		a.method1();

		IntA a1 = new B();
		a1.method1();

	}

}
