package Java;

public class PalindromeNumber {
	
	 public static void main(String args[]){  

		 int StoreNum, reverseNum=0, num=8088;
		 StoreNum = num;
		 while(num > 0) {
				int remainder = num%10;
				 reverseNum = (reverseNum * 10) + remainder;
				 num = num/10;
			}
		 if(reverseNum == StoreNum) {
				System.out.println(StoreNum + " is a palindrome number");
			}else {
				System.out.println(StoreNum + " is not a palindrome number");
			}
	 }
}
