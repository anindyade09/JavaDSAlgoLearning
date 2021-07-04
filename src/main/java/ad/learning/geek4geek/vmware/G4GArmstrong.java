package ad.learning.geek4geek.vmware;

import java.math.BigInteger;

public class G4GArmstrong {

	public static void main(String[] args) {
		System.out.println(G4GArmstrong.checkIfArmstrong(new BigInteger("153")));

	}
	
	public static Boolean checkIfArmstrong(final BigInteger input) {
		int p = input.toString().length();
		BigInteger number = new BigInteger(input.toString());
		BigInteger sum = new BigInteger(BigInteger.ZERO.toString());
		for(int i = 0; i < p; i++) {
			BigInteger digit = number.remainder(new BigInteger("10"));
			sum = sum.add(digit.pow(p));
			number = number.divide(new BigInteger("10"));
		}
		
		return sum.compareTo(input) == 0;
	}

}
