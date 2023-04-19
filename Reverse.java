import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n, sum=0, remainder;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();
		int m = n;
		
		while(m != 0)
		{
			remainder = m%10;
			sum = sum * 10 + remainder;
			m = m/10;
			
			
		}
		
		System.out.println(sum);
		
		
		
		
		sc.close();
		

	}

}
