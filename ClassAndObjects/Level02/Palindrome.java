import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text");
        String text = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker(text);
        pc.checkPalindrome();
        pc.displayResults();
    }
}
class PalindromeChecker  {
//    attribute
    private String text;

    public PalindromeChecker (String text) {
        this.text = text;
    }
    public boolean checkPalindrome() {
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(text.length()-1-i))
                return false;
        }return true;
    }

    public void displayResults() {
        System.out.println("the test is palindrome ? " + checkPalindrome());
    }


}
