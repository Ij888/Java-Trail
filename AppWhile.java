
public class AppWhile {

	public static void main(String[] args) {
		// boolean loop = 4 < 5;
		// int value = 12;
		// boolean loop = value > 20;

		/*
		 * int value = 0; while(value < 10)
		 */ // infinite loop as value will always be less than 10

		int value = 0;
		while (value < 10) {
			System.out.println("Iteration" + value);
			value = value + 1;
		}
	}
}
