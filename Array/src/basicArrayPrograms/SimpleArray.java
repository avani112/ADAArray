import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner s= new Scanner(System.in);
		for(int i=0; i<10;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<10;i++) System.out.println("Array elements are: " + a[i]);
		
		System.out.println("enter element to delete");
		int x=s.nextInt();
		for(int i=0;i<10;i++) {
			if(a[i]==x) {
				a[i]=0;
			}
		}
		s.close();
		for(int i=0;i<10;i++) System.out.println("Array elements are: " + a[i]);
	}
	
}
