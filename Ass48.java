package in.ineuron.main;

public class Ass48 {
	public static void main(String[] args) {
		
		String s="Welcome to iNeuron";
		
		int i,j,max,min;
		
		int freq[]=new int[s.length()];
		
		char minChar=s.charAt(0);
		char maxChar=s.charAt(0);
		
		char arr[]=s.toCharArray();
		
		for(i=0;i<arr.length;i++) {
			freq[i]=1;
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[i]!=' ' && arr[i]!='0') {
					freq[i]++;
					
					arr[j]='0';
				}
			}
		}
		min=max=freq[0];
		for(i=0;i<freq.length;i++) {
			if(min>freq[i]) {
				min=freq[i];
				minChar=arr[i];
			}
			if(max<freq[i]) {
				max=freq[i];
				maxChar=arr[i];
			}
		}
		System.out.println("Minimum ocurring character::"+minChar);
		System.out.println("Maximum ocurring character::"+maxChar);
	}

}
