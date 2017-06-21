package Programs;

import java.util.ArrayList;
import java.util.List;

public class SumOfDivisorsOfFactorial {

	public static void main(String args[]){
		
		int number=4;

		System.out.println("factorial of n:"+factorial(number));
		System.out.println("Sum of Divisors of factorial:");
		System.out.println(sumOfDivisors(factorial(number)));
		
		System.out.println("Check if prime:"+checkIfPrime(number));
		System.out.println("Find prime number below number "+number+":"+findPrimeNumbers(number));
		System.out.println("Sum of divisors using Legendre's formula:"+factorialDivisor(number));
		
	}
	
	public static int factorial(int n){
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static int sumOfDivisors(int n){
		int sum=0;
		
		for(int i=1;i<=n;i++){
			if(n%i==0)
				sum+=i;
		}
		
		return sum;
	}
	
	
	
	public static boolean checkIfPrime(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count+=1;
				continue;
			}
		}
		if(count==2)
			return true;
		else
			return false;
		
	}
	
	public static List findPrimeNumbers(int n){
		List<Integer> primes=new ArrayList<>();
		
		int j=1;
		while(j<n){
			int count=0;
			for(int i=1;i<=j;i++){
				if(j%i==0){
					count+=1;
					continue;
				}
			}
			
			if(count==2)
				primes.add(j);
			j++;
		}
		
		return primes;
		
	}
	
	public static int factorialDivisor(int n){
		
		List<Integer> primes=findPrimeNumbers(n);
		int result=1;
		for(int i=0;i<primes.size();i++){
			int p=primes.get(i);
			int exp=0;
			while(p<=n){
				exp=exp+(n/p);
				p=p*primes.get(i);
			}
			
			result=(int) (result*(Math.pow(primes.get(i),exp+1)-1)/(primes.get(i)-1));
		}
		
		return result;
	}
}
