package java;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int reverseNum = 0, num = 8088;
		 for( ;num != 0; num=num/10) {
				int remainder = num%10;
				 reverseNum = (reverseNum * 10) + remainder;
				 
			}
		 System.out.print("Reverse Number is" + reverseNum);

	}
}