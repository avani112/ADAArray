package basicArrayPrograms;

public class SecondMin {

	public static void main(String[] args) {
		int a[] = {3,7,2,9,4,8,1};
		int min=a[0]; int min2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min2=min;
				min=a[i];		
			}
			else if(a[i]<min2 && a[i]!=min) {
				min2=a[i];
			}
		}
		System.out.println("second smallest: "+min2);
	}

}
