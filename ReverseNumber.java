package basicArrayPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=786;
		System.out.println("Original number");
		int n1=0;
		System.out.println("Reverse number");
		while(n>0) {
			n1 = n1*10 + n%10; 
	        n = n/10; 
		}
		System.out.println(n1);

	}

}
