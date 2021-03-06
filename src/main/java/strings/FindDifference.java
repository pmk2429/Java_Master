package strings;

/**
 * Given two strings s and t which consist of only lowercase letters.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Find the letter that was added in t.
 * <p>
 * Example:
 * Input:
 * s = "abcd"
 * t = "abcde"
 * Output:
 * e
 * Explanation:
 * 'e' is the letter that was added.
 */
public class FindDifference {

  private static char findDifference(String main, String random) {
    char diff = '\0';
    for (int i = 0; i < random.length(); i++) {
      if (!main.contains(String.valueOf(random.charAt(i)))) {
        diff = random.charAt(i);
      }
    }
    return diff;
  }

  private static char difference(String main, String random) {
    int diff = 0;
    for (char c : main.toCharArray()) diff ^= c;
    for (char c : random.toCharArray()) diff ^= c;
    return (char) diff;
  }

  public static void main(String[] args) {
    String s = "abcd";
    String t = "dceba";
    System.out.println(difference(s, t));
  }
}
