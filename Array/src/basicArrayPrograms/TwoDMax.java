package basicArrayPrograms;

public class TwoDMax {
	public static void main(String args[]) {
		int a[][]={{1,2,3,4},{6,7,8,9},{10,11,12,13},{20,21,22,23}};
		System.out.println("original matrix");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		int max=a[0][0],min=a[0][0]; 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]>max) max=a[i][j];
				if(a[i][j]<min) min=a[i][j];
			}
		}
		System.out.println("max "+max);
		System.out.println("min "+min);
		int max2=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]>max) {
					max2=max;
					max=a[i][j];		
				}
				else if(a[i][j]>max2 && a[i][j]!=max) max2=a[i][j];
			}
		}
		
		int min2=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]<min) {
					min2=min;
					min=a[i][j];		
				}
				else if(a[i][j]<min2 && a[i][j]!=min) min2=a[i][j];
			}
		}
		System.out.println("max2 "+max2);
		System.out.println("min2 "+min2);
	}

}
