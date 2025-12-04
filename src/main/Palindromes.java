import java.util.Locale;

public class Palindromes {
  /**
   * Method 2: Check if a phrase is a palindrome (ignore case and spaces)
   *
   * REQUIREMENTS:
   * 1. Ignore case differences
   * 2. Ignore spaces
   * 3. Only compare letters
   *
   * @param phrase The phrase to check
   * @return true if the phrase is a palindrome, false otherwise
   *
   * EXAMPLES:
   * Input: "A man a plan a canal Panama"
   * Output: true
   *
   * Input: "race car"
   * Output: true
   *
   * Input: "hello world"
   * Output: false
   *
   * Input: "Was it a car or a cat I saw"
   * Output: true
   *
   */

  public boolean isPalindromeIgnoreSpaces(String phrase) {

      phrase = phrase.replace(" ", "");
      StringBuilder p1 = new StringBuilder(phrase).reverse();
      return p1.toString().equalsIgnoreCase(phrase);

  }

  public static void main(String[] args) {


  }
}
