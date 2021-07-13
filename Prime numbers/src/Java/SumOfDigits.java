package Java;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=888, orignalNum, sum=0;
		orignalNum = num;
		while(num != 0) {
			int remainder = num % 10;
			sum = sum + remainder;
			num /= 10;
		}
		System.out.println("Sum of "+ orignalNum + " digits is " +sum);
	}

}
