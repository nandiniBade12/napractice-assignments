package itransform.datastructures;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		//int[] arr = new int[15];
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int search_element = 19;
		int found =0;
		for(int i: arr) {
			if(i==search_element) {
				found=1;
			}
		}
		if(found==1)
			System.out.println(search_element + " is found in the array");
		else
			System.out.println(search_element + " is not found in the array");
		
		

	}

}
