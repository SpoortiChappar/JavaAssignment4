package in.ineuron.main;

public class Ass47 {
	public static void main(String[] args) {
		
		String s1="Country";
		int i=0;
		int j=0;
		
		boolean flag=false;
		s1=s1.toLowerCase();
		char arr[]=s1.toCharArray();
		
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Sting contains duplicate characters");
					flag=true;
				}	
			}
		}
		if(flag==false)  
			System.out.println("String contains unique characters");
	}
}
