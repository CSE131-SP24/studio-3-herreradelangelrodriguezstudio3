package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What value of n?");
		int n = in.nextInt();
		int[] primeNumbers;
		primeNumbers = new int[n];
		boolean[] yesPrime;
		yesPrime = new boolean[n];
		for (int i = 0; i < yesPrime.length; i++) {
			yesPrime[i] = true;
		}
		
		for (int i = 2; i < primeNumbers.length; i += 2) {
			
			primeNumbers[i] = i + 2;
			yesPrime[i] = false; 
			
			
			
		}
		for (int i = 3; i < primeNumbers.length; i += 3) {
			primeNumbers[i] = i+3;
			yesPrime[i] = false; 
			
			
		}
		for (int i = 5; i < primeNumbers.length; i += 5) {
			primeNumbers[i] = i+5;
			yesPrime[i] = false; 
			
		}
		for (int i = 7; i < primeNumbers.length; i += 7) {
			primeNumbers[i] = i+7;
			yesPrime[i] = false; 
			
		}
		for (int i = 0; i < yesPrime.length; i++) {
			if (yesPrime[i]=true) {
				int[] prime;
				prime = new int[i];
				for (int l = 0; i < prime.length; i++) {
					
					
					System.out.println(prime[l]);
				}
			}
			else {
				
			}
			
			
		}
		

	}

}
