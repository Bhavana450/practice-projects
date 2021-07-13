package Java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 370, orignalNum, result = 0, n = 0;
		orignalNum = num;
		for(num = orignalNum; num != 0; n++) {
			num /= 10;
		}
		
		 for(num = orignalNum; num != 0; num=num/10) {
				int remainder = num%10;
				 result += Math.pow(remainder,n);
			}
		 if (result == orignalNum) {
			 System.out.println(orignalNum +" is an Armstrong number");
		 }else {
			 System.out.println(orignalNum +" is not an Armstrong number");
		 }
	}

}
