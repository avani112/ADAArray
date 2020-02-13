package basicArrayPrograms;

public class NumPalindrome {
	public static void main(String[] args) {
		//int n=786687;
		int n=786;
		int m=n;
		int n1=0;
		while(n>0) {
			n1 = n1*10 + n%10; 
	        n = n/10; 
		}
		if(n1==m) System.out.println("number is palindrome");
		else System.out.println("number is not palindrome");

	}


}
