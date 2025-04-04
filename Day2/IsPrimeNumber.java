package homeassignment.Day2;

public class IsPrimeNumber { 
	public static void main(String[] args) {
	int count = 0, n = 11;
	if ( n <=1 ) {
		System.out.println("The number is not prime");
		return;
	}
	for (int i = 1; i <= n/2; i++ ) {
		if ( n % i == 0 ) {
			count++;
			
		}
	}
	if ( count > 1) {
		System.out.println("The number is not prime");
	}
	else {
		System.out.println("The number is prime");
	}

}
}
