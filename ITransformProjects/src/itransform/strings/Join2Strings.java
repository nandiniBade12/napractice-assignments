package itransform.strings;

import java.util.StringJoiner;

public class Join2Strings {

	public static void main(String[] args) {
		
//		StringJoiner str = new StringJoiner(" ", "[", "]");
//	    
//        str.add("Hello!");
//        str.add("Welcome");
//        str.add("to");
//        str.add("Java");
//        str.add("Coding");
//        
//        System.out.println(str);
        
        String str = String.join("  ", "My", "name", "is", "Nandini", "Bade"); 
        //String.join method requires 2 parameters("delimiter" , "strings")
        
        System.out.println(str);
	}

}
