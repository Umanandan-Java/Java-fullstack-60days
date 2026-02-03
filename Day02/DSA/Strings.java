import java.util.Arrays;
class Strings{
    public static void main(String[] args){
        String str="mom";
        System.out.println(palindrome(str));
        reverse("Nandan");
        
    }

    static void reverse(String str){
        StringBuilder name = new StringBuilder(str);
        System.out.println(name.reverse());

    }
    static String palindrome(String str){
        for(int i=0;i<str.length();i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start == end){
                
            }
            else{
                return "not a palindrome";
            }
            
        }
        return "palindrome";
    }
}