package random;

public class HelloWorld{
public static boolean isPalindrome(String str)
{
    char[] ch = str.toCharArray();
    for(int i=0; i<ch.length;i++)
    {
        if(ch[i]!=ch[ch.length-i-1])
        {
            return false;
        }
    }
    return true;
    
    
}
     public static void main(String []args){
        String str ="good";
        
        if(isPalindrome(str))
        {
            System.out.println("String is palindrome");
        }else{
            System.out.println("string is not palindrome");
        }
        
     }
}
