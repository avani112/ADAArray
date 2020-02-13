package basicArrayPrograms;

public class IthDigit {
	
	public static void main(String args[]) {
		int n=78269;
		int n1=n;
		int r=0;
		int I=2;
		int nod=digits(n);
		System.out.println(I+"th digit is");
		if(I>nod) {
			System.out.println("invalid input");
		}
		else {
			for(int i=1;i<=I;i++) {
				r=n1%10;
				n1=n1/10;
			}
			System.out.println(r);			
		}
	}
	static int digits(int n) {
		int count=0;
		int n1=n;
		while(n1!=0) {
			n1=n1/10;
			count++;
		}
		return count;
	}

}
