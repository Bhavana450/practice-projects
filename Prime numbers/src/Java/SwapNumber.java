package Java;

public class SwapNumber {

	
	public static void SwapNum(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swaping x = "+ x + " & y = "+ y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumber.SwapNum(10, 20);
	}

}
