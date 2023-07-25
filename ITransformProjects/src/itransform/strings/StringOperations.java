package itransform.strings;

public class StringOperations {

	public static void main(String[] args) {
		
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		String str2 = "java String pool refers to collection of strings which are stored in heap memory";
		
		System.out.println("Lowercase of string is: ");
		System.out.println(str.toLowerCase());
	
		System.out.println("Uppercase of string is: ");
		System.out.println(str.toUpperCase());
		
		System.out.println("Replace all characters of  'a' to '$' string is: ");
		System.out.println(str.replace('a','$'));
		
		System.out.print("String str contains word 'collection': ");
		System.out.println(str.contains("collection"));
		
		System.out.print("str2 matches exactly with str: ");
		System.out.print(str.equals(str2));
		
		System.out.print("str2 matches with str ignoring the case of strings: ");
		System.out.print(str.equalsIgnoreCase(str2));

	}

}
