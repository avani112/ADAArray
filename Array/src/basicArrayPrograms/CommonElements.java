package basicArrayPrograms;

public class CommonElements {
	public static void main(String args[]) {
		int a[] = {2,5,6,8,3};
		int b[] = {3,7,2,9,4};
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if (a[i]==b[j]) {
					System.out.println("common elements are: "+a[i]);
				}
			}
		}
	}
}
