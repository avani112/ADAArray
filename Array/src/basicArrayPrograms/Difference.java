package basicArrayPrograms;

public class Difference {

	public static void main(String[] args) {
		int a[] = {3,7,2,9,4,8,1};
		int max=a[0]; int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) max=a[i];
			if(a[i]<min) min=a[i];
		}
		System.out.println("Difference between min and max: "+(max-min));
	}

}
