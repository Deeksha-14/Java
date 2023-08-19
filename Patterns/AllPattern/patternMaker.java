package patterns;

public class patternMaker {

	public static void numberTriangular() {

//		    1
//		   2 2
//		  3 3 3
//		 4 4 4 4

		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}

	}





	public static void hollowSquare(int n)
	{
		
//		**********
//		*        *
//		*        *
//		*        *
//		*        *
//		*        *
//		**********
		
		for(int i =1; i<=n; i++)
		{
			for(int j =1; j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
				{
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
	}
}
