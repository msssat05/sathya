package Java_Programs;

public class Prime_numbers {

	public static void main(String[] args) {
		int c;
		int d = 0;
		for (int i = 2; i < 100; i++) {
			 c = 0;
			for (int n = 2; n < i; n++) {
				if(i%n==0) {
					c++;
					break;
				}				
			}	
			if(c==0) {
				System.out.println(i +" is prime");
				d++;
		}
		
			
			}
		System.out.println("Total count is: "+d);
	}
}
