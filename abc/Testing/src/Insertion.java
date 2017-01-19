
public class Insertion {
public static void insertionSort(int[] arr){
	for(int j=1;j<arr.length;j++){
		int key=arr[j];
		int i=j-1;
		while((i>-1)&&(arr[i]>key)){
			arr[i+1]=arr[i];
			i--;
			
		}
	
	arr[i+1]=key;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]	arr={19,2,1,7,3,9};
	System.out.println("before sorting");
for(int i:arr){
	System.out.println(i+" ");
}
insertionSort(arr);
System.out.println("aftr sorting");
for(int i:arr){
	System.out.println(i+" ");
}
	}

}
