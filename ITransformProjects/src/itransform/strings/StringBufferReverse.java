package itransform.strings;

public class StringBufferReverse {

	public static void main(String[] args) {
		
		String s = "This method returns the reversed object on which it was called";
		
		StringBuffer stbr = new StringBuffer(s);
		
		System.out.println("Original String:");
		System.out.println(stbr);
		
		stbr.reverse();
		
		System.out.println("Reversed String:");
		System.out.println(stbr);
	}

}
