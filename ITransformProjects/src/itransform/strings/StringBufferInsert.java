package itransform.strings;

public class StringBufferInsert {

	public static void main(String[] args) {
		
		String s = "It is used to _at the specified index position";
		String to_insert = "insert text";
		
		StringBuffer stbr = new StringBuffer(s);
		stbr.insert(s.indexOf('_'), to_insert);
		
		System.out.println(stbr);
	}

}
