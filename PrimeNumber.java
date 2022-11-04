
public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int min = 0;
		int max = 1000;
		//find prime numbers in the given 
		for(int i=min; i<=max; i++) {
			//check if this number is prime
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrime(int num) {
		for(int i = 2; i <= num/i; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
