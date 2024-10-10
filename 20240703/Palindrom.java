public class Palindrom{
    
    public static void isPalindrome(String str){
        
        int left = 0;
        int right = str.length() -1;
        while(right > left){
            
            if( str.charAt(left) != str.charAt(right) ){
                System.out.println("It is not a palindrom");
                return;
            }
        
            right--;
            left++;
        }          
        System.out.println("It is a palindrom");  
    }

    public static void main(String[] args){

        //example: level

        String[] testStrings = {"level","world", "racecar","hello","madam"};

        for (String testString : testStrings) {
            System.out.print("Checking \"" + testString + "\": ");
            isPalindrome(testString);
        }

    }


}