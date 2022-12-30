package in.ineuron.main;

public class Ass41 {
	public static void main(String[] args) {
		
		String s1="Spoorti";
		s1=s1.toLowerCase();
		StringBuilder sb=new StringBuilder(s1);
		
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println(sb);
	}
}
