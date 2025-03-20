// Question: Reverse a signed 32-bit integer. If reversed integer overflows, return 0.
// Solution: Extract digits using modulo and division, check for overflow before adding.

import java.util.*;

public class ReverseInteger {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;
        
        System.out.println(reverse(x1));
        System.out.println(reverse(x2));
        System.out.println(reverse(x3));
    }
}

// Expected Output:
// 321
// -321
// 21

