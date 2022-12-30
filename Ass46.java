package in.ineuron.main;

public class Ass46 {
	
	public static void main(String[] args){
		
	String s1 ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
	
	s1=s1.toLowerCase();
	s1=s1.replace(" ","");
	boolean flag=false;
	char arr[]=s1.toCharArray();
	int a[]=new int[26];
	
	for(int i=0;i<arr.length;i++) {
		int index=arr[i]-97;
		a[index]++;
		
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]==0) {
			System.out.println("It is not a Pangram");
			flag=true;
		}
	}
	if(flag==false)
		System.out.println("It is a Pangram");
	}
}
