package in.ineuron.main;

public class Ass43
{

	public static void main(String[] args) {
		
	
	String s1="2552";
	String s2 ="";
	
	s1=s1.toLowerCase();

	
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	}
	if(s1.contentEquals(s2))
	 System.out.println("Palindrome");
	else
	 System.out.println("Not Palindrome");
	}
	
	
}
