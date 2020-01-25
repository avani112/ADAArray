package basicArrayPrograms;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[] = {1,1,2,5,6,8,3,5,8};
		System.out.println("length before removing duplicates: "+a.length );
		System.out.println("original array: ");
		for(int i=0; i<a.length; i++) System.out.println(a[i]);
		int l = a.length;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(a[i]==a[j]) {
					a[j]=a[l-1];
					l--;
					j--;
				}
			}
		}
		System.out.println("Duplicate elements removed");
		int b[] = Arrays.copyOf(a, l);
		for(int i=0; i<b.length; i++) System.out.println(b[i]);
		System.out.println("length after removing duplicates: "+b.length );
	}

}
