package palindromechecker;
import java.util.Scanner;
public class Palindromechecker{
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Input Text");
    String input=sc.nextLine();
    boolean isPalindrome= true;
    int n=input.length()-1;
    for (int i=0;i<=n;i++){
        if(input.charAt(i)!=input.charAt(n-i)){
            isPalindrome=false;
            break;
        }
 
        
    }
    if(isPalindrome){
        System.out.println("It is a palindrome ?"+isPalindrome);
    }else{
        System.out.println("it is a palindrome?"+isPalindrome);
        }
    };
    
}
