
public class FibonacciNumber {
	public int getFibonacciNumberRecursively(int n){
		if(n == 0) return 0;
		if(n == 1 || n == 2) return 1;
		
		return getFibonacciNumberRecursively(n-1) + getFibonacciNumberRecursively(n-2);
	}
	
	public int getFibonacciNumber(int n){
		if(n == 1 || n == 2) return 1;
		
		int f1 = 1, f2 = 1, fibonacci = 1;
		
		for(int i = 3; i<=n;i++){
			fibonacci = f1 + f2;
			f1 = f2;
			f2 = fibonacci;
		}
		
		return fibonacci;
	}
	
	
}
