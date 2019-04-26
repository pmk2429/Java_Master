package arrays.subs;

/**
 * Given a string S and a string T, count the number of distinct subsequences of S which equals T.
 * <p>
 * A subsequence of a string is a new string which is formed from the original string by deleting some
 * (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 * <p>
 * Example 1:
 * ----------
 * Input: S = "rabbbit", T = "rabbit"
 * Output: 3
 * Explanation:
 * ------------
 * As shown below, there are 3 ways you can generate "rabbit" from S.
 * (The caret symbol ^ means the chosen letters)
 * rabbbit
 * ^^^^ ^^
 * rabbbit
 * ^^ ^^^^
 * rabbbit
 * ^^^ ^^^
 * Example 2:
 * ----------
 * Input: S = "babgbag", T = "bag"
 * Output: 5
 * Explanation:
 * ----------
 * As shown below, there are 5 ways you can generate "bag" from S.
 * (The caret symbol ^ means the chosen letters)
 * babgbag
 * ^^ ^
 * babgbag
 * ^^    ^
 * babgbag
 * ^    ^^
 * babgbag
 * ^  ^^
 * babgbag
 * ^^^
 */
public class Subsequences {
  private static int numDistinct(String s, String t) {
    if (s == null || t == null || t.length() > s.length()) return 0;
    int sLen = s.length(), tLen = t.length();
    int[] counts = new int[sLen + 1];
    for (int i = 0; i <= sLen; ++i) counts[i] = 1;
    for (int ti = 1; ti <= tLen; ++ti) {
      int pre = 0;
      for (int si = 1; si <= sLen; ++si) {
        int preT = counts[si];
        if (t.charAt(ti - 1) == s.charAt(si - 1)) {
          counts[si] = counts[si - 1] + pre;
        }
        else {
          counts[si] = (si == 1 ? 0 : counts[si - 1]);
        }
        pre = preT;
      }
      counts[0] = 0;
    }
    return counts[sLen];
  }
}
