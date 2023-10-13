package q15894;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		

		BigInteger n = BigInteger.valueOf(Long.valueOf(br.readLine()));
		
		System.out.println(n.multiply(BigInteger.valueOf(4)));
	}
}
