package basicArrayPrograms;

public class TwoArraySum {
	public static void main(String args[]) {
		int a[]= {12,36,45,57,87,89};
		int b[]= {11,54,76,90};
		int al=a.length  , bl=b.length;
		int c[]= new int[al+bl];
		int i=0,j=0,k=0;
		while((i<al) && (j<bl) &&(k<al+bl)) {
			if (a[i]==36) {
				 i++; continue;
			}
			else if (b[j]==36) {
				 j++;continue;
			}
			else if(a[i]<b[j]) {
				c[k++]=a[i]; i++;
			}
			else if(a[i]>b[j]) {
				c[k++]=b[j]; j++;
			}
		}
		while(i<al && k<(al+bl)) {
			c[k++]=a[i]; i++;
		}
		while(j<bl && k<(al+bl)) {
			c[k++]=b[j]; j++;
		}
		for(int x=0;x<c.length;x++) {
			if(c[x]!=0) System.out.print(c[x]+" ");
		}
	}
}
