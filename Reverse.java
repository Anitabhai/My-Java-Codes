
public class Reverse {
    public int revCalculation(int x) {
        double INT_MAX = Math.pow (2, 31) - 2;
        double INT_MIN = -(Math.pow (2, 31));
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > INT_MAX/10 || (rev == INT_MAX / 10 && pop > 7)) return 0;
            if (rev < INT_MIN/10 || (rev == INT_MIN / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
