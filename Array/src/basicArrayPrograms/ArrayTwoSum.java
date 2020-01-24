package basicArrayPrograms;

public class ArrayTwoSum {
	public static void main(String args[]) {
		int a[]= {12,36,45,57,87,89};
		int b[]= {11,54,76,88,90};
		int al=a.length  , bl=b.length;
		int c[]= new int[al+bl];
		int i=0,j=0,k=0;
		while((i<al) && (j<bl) &&(k<al+bl)) {
			if(a[i]<b[j]) {
				c[k++]=a[i]; i++;
			}
			else {
				c[k++]=b[j]; j++;
			}
		}
		while(i<al && k<(al+bl)) {
			c[k++]=a[i]; i++;
		}
		while(j<bl && k<(al+bl)) {
			c[k++]=b[j]; j++;
		}
		for(int x=0;x<(al+bl);x++) {
			System.out.print(c[x]+" ");
		}
	}
}
