package basicArrayPrograms;

public class TwoDDiagonal {
	public static void main(String args[]) {
		int a[][]={{1,2,3,4},{6,7,8,9},{10,11,12,13},{20,21,22,23}};
		System.out.println("original matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\ndiagonal: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if (a[i]==a[j]) System.out.print(a[i][j]+" ");
			}
		}
		System.out.print("\nAntidiagonal: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if (i + j == a.length - 1) System.out.print(a[i][j]+" ");
			}
		}
	}
}
