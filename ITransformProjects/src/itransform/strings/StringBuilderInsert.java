package itransform.strings;

public class StringBuilderInsert {

	public static void main(String[] args) {
		
		String s = "It is used to _at the specified index position";
		String to_insert = "insert text";
		
		StringBuilder stb = new StringBuilder(s);
		stb.insert(s.indexOf('_'), to_insert);
		
		System.out.println(stb);

	}

}
