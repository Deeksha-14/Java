package patterns;
import patterns.patternMaker;
public class PatternMain {

	public static void main(String[] args) {
	
	
		patternMaker.numberTriangular();

		System.out.println("ENter number of n for hollow triangle : ");
		int n = sc.nextInt();
		patternMaker.hollowSquare(n);
		
		sc.close();

	}

}
