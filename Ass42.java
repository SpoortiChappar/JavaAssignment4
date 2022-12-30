package in.ineuron.main;

public class Ass42 {
	public static void main(String[] args) {
		
		String s1="India";
		
		s1=s1.toLowerCase();
		char arr[]=s1.toCharArray();
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate characters of a string are::"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("String does not contains duplicate characters ");
		}
		
	}

}
