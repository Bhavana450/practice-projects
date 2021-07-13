package Java;

public class Factorial {

	public static int factorial(int num) {
		
		if (num == 0 || num == 1) return 1;
		int fact = num * factorial(num-1);
			return fact;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(4));
	}

}
