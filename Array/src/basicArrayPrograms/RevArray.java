package basicArrayPrograms;

public class RevArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,1,7};
		int b[] = new int[5];
		for(int i=0; i<5; i++) {
			b[i]=a[4-i];
			System.out.println(b[i]);
		}

	}

}
