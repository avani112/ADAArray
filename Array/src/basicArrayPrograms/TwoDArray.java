package basicArrayPrograms;

public class TwoDArray {

	public static void main(String[] args) {
		int a[][]={{1,3,4},{6,7,9},{10,11,12}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}		
	}
}
