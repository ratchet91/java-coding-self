package main;

public class RandonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lower = 0;
		int high = 100;
		for (int i = 0; i < 5; i++) {
			int random = (int) (Math.random() * 5) + 1;
			System.out.println("print random : " + random);
		}

	}

}
