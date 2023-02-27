import java.io.*;
import java.util.*;
public class Assignment2 {

    public static void main(String[] args)throws FileNotFoundException {
        File f = new File("C:/Users/TUF GAMING/Desktop/Assignment2/input1.txt");
        Scanner myscan = new Scanner(f);
        StringTokenizer token;
        String[] emoji = {":)",":(",":P",":D",":‑)",":->",";)",":')","XD",":*","<3","._.","T_T",">:3",":o)",":c)","=]"};
        int countChar = 0;
        int countPalindrome = 0;
        int countToken = 0;
        int countNewline = 0;
        
        int[] countEmoji = new int[emoji.length];
        double tokensize = 0;
        int longesttokenlength = 0;
        String longesttoken ="";
        long firsttime = System.currentTimeMillis();

        while (myscan.hasNextLine()) {
            String dataline = myscan.nextLine();
           

            token = new StringTokenizer(dataline," ");
            while (token.hasMoreTokens()) {
                String mtoken = token.nextToken();
                countToken++;
                if (isPalindrome(mtoken)) {
                    countPalindrome++;
                    
                }
                for (int i = 0; i < emoji.length; i++) {
                    if (mtoken.equals(emoji[i])) {
                        countEmoji[i]++;
                        
                        
                    }
                    
                }
                if (mtoken.length() > longesttokenlength) {
                    longesttokenlength = mtoken.length();
                    longesttoken = mtoken;
                    
                }
                tokensize += mtoken.length();
                
            }
            countChar +=dataline.replaceAll("\\s", "").length();
            countNewline++;
            
            
        }
        double averagetoken = tokensize/countToken;
        myscan.close();
        long lasttime = System.currentTimeMillis();
        long totaltime = (lasttime-firsttime);
        ToString(countChar, countPalindrome, countToken, emoji, countEmoji, countNewline, averagetoken, longesttoken, longesttokenlength, totaltime);


        
    }
    // find palindrome method
    public static boolean isPalindrome(String str){
        int size = str.length();
        for (int i = 0; i < size/2; i++) {
            if (str.charAt(i) != str.charAt(size-i-1)) {
                return false;
                
            }
            
        }
        return true;

    }
    public static void  ToString(int chars,int palindrome, int token,String[] emoji ,int[] countemoji, int newline,double average,String longeststr,int longestlength,long time){
        System.out.println("Total Character : "+chars);
        System.out.println("Total parindrome : "+palindrome);
        System.out.println("Total token : "+token);
        for (int i = 0; i < emoji.length; i++) {
            System.out.println("Total emojicon for "+emoji[i]+" : "+countemoji[i]);
            
        }
        System.out.println("Total new line : "+newline);
        System.out.printf("Average token size: %.2f\n", average);
        System.out.println("Longest token is : "+longestlength);
        System.out.println("Time to execute is "+time);
    }
}