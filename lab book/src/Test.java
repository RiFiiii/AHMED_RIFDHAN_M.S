import java.util.Scanner;
public class Test {


	public static void main(String[] abcd) {
		 int sum=0,maxsum=0,n=6;
		 int a[]= {2,-2,-1,3,4,2};
		 for(int i=0;i<n;i++){
			 if(i==0|| a[i]<0 ||a[i]<a[i-1]) {
				 if(sum>maxsum)
					 maxsum=sum;
				 sum=(a[i]>0)?a[i]:0;
			 }
			 else sum+=a[i];
		 }
		 if(sum<maxsum)maxsum=sum;
		 System.out.println(maxsum);
	}

}
