package javaPrograms;

public class ArmStrong {

	public static void main(String[] args) {
		int cube = 0, a, temp;
		int n = 153;// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			cube = cube + (a * a * a);
		}
		if (temp == cube)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");
	}

}
