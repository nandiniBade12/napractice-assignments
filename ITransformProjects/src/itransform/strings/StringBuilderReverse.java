package itransform.strings;

public class StringBuilderReverse {

	public static void main(String[] args) {
		
		String s = "This method returns the reversed object on which it was called";
		
		StringBuilder stb = new StringBuilder(s);
		
		System.out.println("Original String:");
		System.out.println(stb);
		
		stb.reverse();
		
		System.out.println("Reversed String:");
		System.out.println(stb);

	}

}
