// https://leetcode.com/problems/lemonade-change/description/

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int i = 0, n = bills.length;
        int five = 0, ten = 0;

        for (int x : bills) {
            if (x == 5)
                five++;
            if (x == 10)
                ten++;
            int toReturn = x - 5;
            if (toReturn == 5) {
                if (five <= 0)
                    return false;
                five--;
            }
            if (toReturn == 15) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                    continue;
                }
                if (five > 2) {
                    five -= 3;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
