package random;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	
	public static boolean areAnagram(String s1, String s2)
	{
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(c1.length != c2.length)
		{
			return false;
		}
		
		for(int i =0; i<c1.length; i++)
		{
			if(c1[i] != c2[i])
			{
				return false;
			}
		}
		
		
		return true;
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter first string : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter Second string : ");
		String s2 = sc.nextLine();
		
		if(areAnagram(s1, s2))
		{
			System.out.println("anagrams");
		}else {
			System.out.println("not anagrams");
		}
		
		

		
		
	}

}
