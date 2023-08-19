package random;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		
		int[][] originalArr =  {{1,2,3,},{4,5,6},{7,8,9}};
		
		
		int[][] transposeArr = new int[3][3];
		
		for(int i =0; i<3; i++)
		{
			for(int j =0; j<3;j++)
			{
				transposeArr[i][j]=originalArr[j][i];
			}
		}
		
		System.out.println("original matrix is ");
		
		for(int i=0; i<3;i++)
		{
			for(int j =0; j<3;j++)
			{
				System.out.print(originalArr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println("result matrix is ");
		for(int i=0; i<3;i++)
		{
			for(int j =0; j<3;j++)
			{
				System.out.print(transposeArr[i][j]);
			}
			System.out.println();
		}

	}

}
