package basicArrayPrograms;

public class ThreeArraySum {
	public static void main(String args[]) {
		int a[]= {12,36,45,57,87,89};
		int b[]= {11,54,76,88,90};
		int c[]= {45,54,90};
		int al=a.length  , bl=b.length , cl=c.length;
		int d[]= new int[al+bl+cl];
		int i=0,j=0,k=0,l=0;
		while((i<al) && (j<bl) && (k<cl) && (l<al+bl)) {
			if (a[i]==c[k]) {
				 i++; k++; continue;
			}
			else if (b[j]==c[k]) {
				 j++; k++; continue;
			}
			else if(a[i]<b[j]) {
				d[l++]=a[i]; i++;
			}
			else if(a[i]>b[j]) {
				d[l++]=b[j]; j++;
			}
		}
		while(i<al && k<cl && l<(al+bl)) {
			d[l++]=a[i]; i++; k++;
		}
		while(j<bl && k<cl && l<(al+bl)) {
			d[l++]=b[j]; j++; k++;
		}
		for(int x=0;x<d.length;x++) {
			System.out.print(d[x]+" ");
		}
	}
}
