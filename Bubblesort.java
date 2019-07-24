package Stackimplima;

public class Bubblesort {

	public static void main(String[] args) {
		int arr []= {20,12,52,32,45};
		System.out.println("Before sorting");
		for(int i:arr) {
  	 System.out.println(i);
     }
	
     Bubblesort(arr);
     System.out.println("After sorting");
     for(int i:arr) {
     
    	 System.out.println(i);
	}
	}

	public static void Bubblesort(int[] arr) {
		int temp=0;
		 for(int i=0;i<arr.length;i++) {
			 for(int j = 1;j<arr.length;j++) {
				 if(arr[j-1]>arr[j]) {
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
	}
}
		
	
