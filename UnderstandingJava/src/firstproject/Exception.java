package firstproject;

import java.io.IOException;

public class Exception {

	public static void main(String[] args) throws IOException {
		try {
		throw new IOException("Abort abort!!");
		}
		catch(ArithmeticException e) {
			System.out.println(""+e.getMessage());
		}
	}

}
 