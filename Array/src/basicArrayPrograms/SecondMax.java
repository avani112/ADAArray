package basicArrayPrograms;

public class SecondMax {

	public static void main(String[] args) {
		int a[] = {3,7,2,9,4,8,1};
		int max=a[0]; int max2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max2=max;
				max=a[i];		
			}
			else if(a[i]>max2 && a[i]!=max) {
				max2=a[i];
			}
		}
		System.out.println("second largest: "+max2);
	}

}
