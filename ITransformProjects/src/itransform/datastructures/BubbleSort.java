package itransform.datastructures;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		System.out.println("Array before sorting");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Array after sorting");
		sortingMethod(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] sortingMethod(int[] arr) {
		
		int temp=0;
		int n=arr.length;
		for(int i=0; i < n-1; i++){  
            for(int j=0; j <(n-i-1); j++){  
                     if(arr[j] > arr[j+1]){    
                            temp = arr[j];  
                            arr[j] = arr[j+1];  
                            arr[j+1] = temp;  
                    }        
             } 
		}
		return arr;
		
	}

}
