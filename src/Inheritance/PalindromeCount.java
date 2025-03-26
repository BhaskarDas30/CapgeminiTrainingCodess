package Inheritance;
public class PalindromeCount {
	 static boolean isPalindrome(String s, int i, int j) {
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j)) 
	            	return false;
	            i++;
	            j--;
	        }
	        return true;
	    }
	    static int countPS(String s) {
	        int n = s.length();
	        int res = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (isPalindrome(s, i, j)) 
	                    res++;  
	            }
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	        String s = "abaab";
	        System.out.println(countPS(s));
	    }
}
//int count=0;
//for(int i=0;i<s.length();i++) {
//	count+=fun(s,i,i);
//	count+=fun(s,i,i+1);
//}
//int fun(String s,int left,int right) {
//	while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
//		count++;
//		left--;
//		right++;
//	}
//	return count;
//}