
public class Selection {
static void selectionSort(int[] arr){
	for(int i=0;i<arr.length-1;i++){
		int index=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[j]<arr[index]){
				index=j;
			}
		}
		int smallernumber=arr[index];
		arr[index]=arr[i];
		arr[i]=smallernumber;
	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={15,19,2,3,6,4,0,1};
System.out.println("array before sorting");
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
System.out.println();
selectionSort(arr);
System.out.println("array after sorting");
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
	}

}
