package Programs;

public class Fibonacci {

    static int[] a =new int[1000];
    public static void main(String args[]) {
        int n = 5;
        int sum = 0, fsum = 0;
        int first = 1;
        int second = 1;
        sum = first + second;
        System.out.print(first + " " + second);
        for (int i = 2; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;

            System.out.print(" " + sum);
        }
        System.out.println("");
        System.out.println(sum);
        
        System.out.println("Fibonacci using resursion---------------");
        for(int i=0;i<n;i++){
        	System.out.println(fibonacci(i,1,0));
        }
        int fib=fibonacci(n,1,0);
        System.out.println("fibonacci"+fib);
        
        System.out.println("optimized fibonacci------------------");
        System.out.println(optimizedFibonacci(40));



}
    public static int fibonacci(int term, int val,int prev){
        if(term == 0) return prev;
        if(term == 1) return val;
        return fibonacci(term - 1, val+prev, val);
}
    
    public static int fibonacci(int n){
    	if(n==0) return 0;
    	if(n==1) return 1;
    	return fibonacci(n-1)+fibonacci(n-2);
    }
    
    public static int optimizedFibonacci(int n){
    	if(n==0) return 0;
    	if(n==1) return 1;
    	if(a[n]!=0) return a[n];
    	a[n]=optimizedFibonacci(n-1)+optimizedFibonacci(n-2);
    	return a[n];
    	
    }
    
    
}
