package Java;

public class FibonacciSequence {

	
	public static int fibonacci(int num) {
		if (num == 0) return 0;
		if (num <=2) return 1;
		 int fib = fibonacci(num-1) + fibonacci(num-2);
		 return fib;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while (true) {
		System.out.println(fibonacci(i));
		i++;
		}
	}

}

//end

