package in.ineuron.main;

public class Ass44 {
	public static void main(String[] args) {
		
		int vCount=0; int cCount=0;int sCount=0; int dCount=0;
		String s1="Welcome to iNeuron 1234 !@#$%";
		
		s1=s1.toLowerCase();
		
		s1=s1.replace(" ", "");
		
		//char arr[]=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i'||s1.charAt(i)=='o' ||s1.charAt(i)=='u') {
				vCount++;
			}else if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
				cCount++;
			}else if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
				dCount++;
			}else {
				sCount++;
			}
		}
		System.out.println("Number of vowels ::"+vCount);
		System.out.println("Number of consonants ::"+cCount);
		System.out.println("Number of digits ::"+dCount);
		System.out.println("Number of Special characters ::"+sCount);
	}

}
