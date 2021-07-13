package Java;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int reverseNum = 0, num = 8088;
		 while(num != 0) {
				int remainder = num%10;
				 reverseNum = (reverseNum * 10) + remainder;
				 num=num/10;
			}
		 System.out.print("Reverse Number is " + reverseNum);

	}
}