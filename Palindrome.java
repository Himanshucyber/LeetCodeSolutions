 public class Palindrome {
	public static boolean isPalindrome(int x) {
        int tempNum=x;
        int rev = 0;
        while(tempNum >0){
            int tempVar = tempNum%10;
             rev=rev*10+tempVar;
             tempNum = tempNum/10;
        }
        if(x == rev){
            return true;
        }
        return false;
    }
	public static void main(String[] args){

		int num = 122;

		boolean result = isPalindrome(num);

		System.out.println(result);
	
	}
}