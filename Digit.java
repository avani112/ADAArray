package basicArrayPrograms;

public class Digit {
	public static void main(String args[]) {
		int n=786;
		int n1=n;
		int r=0;
		System.out.println("digits:");
		while(n1!=0) {
			r=n1%10;
			n1=n1/10;
			System.out.println(r);
		}
	}
}
