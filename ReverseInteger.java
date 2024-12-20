/**
 * LeetCode Problem: Reverse Integer
 * 
 * Given a signed 32-bit integer `x`, return `x` with its digits reversed. 
 * If reversing `x` causes the value to go outside the signed 32-bit integer 
 * range [-2^31, 2^31 - 1], then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed 
 * or unsigned).
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: x = 123
 * Output: 321
 * 
 * Example 2:
 * 
 * Input: x = -123
 * Output: -321
 * 
 * Example 3:
 * 
 * Input: x = 120
 * Output: 21
 * 
 * Constraints:
 * - -2^31 <= x <= 2^31 - 1
 */


 public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            
            x /= 10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }
}


/* 
* Example 3:
* 
* Input: x = 120
* Output: 21
* 
* Constraints:
* - -2^31 <= x <= 2^31 - 1
*/

