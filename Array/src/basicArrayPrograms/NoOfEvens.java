package basicArrayPrograms;

public class NoOfEvens {

	public static void main(String[] args) {
		int a[] = {3,7,2,9,4,8,1};
		int even=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) even++;
		}
		int odd=a.length-even;
		System.out.println("even "+even);
		System.out.println("odd "+odd);
	}

}
