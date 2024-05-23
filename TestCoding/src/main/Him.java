package main;

public class Him implements IntA, IntB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Him bs = new Him();

		bs.setA();

	}

	@Override
	public void setA() {
		// TODO Auto-generated method stub
		IntA.super.setA();
		IntB.super.setA();
	}

}
