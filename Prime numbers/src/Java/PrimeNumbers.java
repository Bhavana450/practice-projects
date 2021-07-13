/**
 * 
 */
package Java;

/**
 * @author bhavanar
 *
 */
public class PrimeNumbers {

	/**
	 * @param args
	 */
	

	
	public static void checkPrime(int num) {
		int i,m=0;
		
		if(num == 0 || num == 1) {
			System.out.println(num + " is neither prime nor composite");
		}else {
		  for (i = 2; i <= num / 2; i++) {
			    if (num % i == 0) {   // condition for non-prime
			      m = 1;
			      break;
			    }
			  }
		  if (m==1) {
			  System.out.println(num + " is not Prime Number");
		  }else {
			  System.out.println(num + " is Prime Number");
		  }
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	checkPrime(0);
	}

}
