package basicArrayPrograms;

public class TwoDSecondMin {

	public static void main(String[] args) {
		int a[][]={{1,2,3,4},{6,7,8,9},{10,11,12,13},{20,21,22,23}};
		int min=a[0][0], min2=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]<min) {
					min2=min;
					min=a[i][j];		
				}
				else if(a[i][j]<min2 && a[i][j]!=min) min2=a[i][j];
			}
		}
		System.out.println("min2 "+min2);

	}

}
