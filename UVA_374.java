import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BigInteger b, m, p, result;
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()){
			b = scanner.nextBigInteger();
			p = scanner.nextBigInteger();
			m = scanner.nextBigInteger();
			
			result = b.modPow(p, m);
			System.out.println(result);
		}
	}
}
