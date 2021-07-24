package problems;

public class findRange34 {
//	public static int[] findRange(int arr[],int target) {
//		
//	}
public static void main(String[] args) {
	int arr[]=new int[] {2,4,5,2,6,6,7,6};
//	findRange(arr, 6);
	int target=6;
//	int result[]=new int[2];
	int first=-1;
	int last=-1;
	int n=arr.length;
	for(int i=n-1;i>=0;i--) {
		if(arr[i]==target) {
			last=i;
			break;
		}
	}
	for(int i=0;i<n;i++) {
		if(arr[i]==target) {
			first=i;
			break;
		}
	}
//	result[0]=first;
//	result[1]=last;
	System.out.println("First occurance is "+first +"\n" +"Last occurance is "+last);
	
}
}
