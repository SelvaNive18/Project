package Loop;

public class ReversedString {
	public static void main(String[] args) {
		String word="Internship";
		String value=" ";
		for(int i=word.length()-1;i>=0;i--) {
			value=value+word.charAt(i);
		System.out.println(value);	
		}
		//System.out.println(value);
	}

}
