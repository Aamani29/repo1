
public class Bubble {
static void bubbleSort(int[] arr){
	int temp=0,n=arr.length;
	for(int i=0;i<n;i++){
		for(int j=1;j<(n-i);j++){
			if(arr[j-1]>arr[j]){
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,34,1,2,67,5,3,4,78};
        System.out.println("array before sorting");
        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]+" ");
        
        
	}
       System.out.println();
        bubbleSort(arr);
        System.out.println("array after sorting");
        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]+" ");
        }
}
}
