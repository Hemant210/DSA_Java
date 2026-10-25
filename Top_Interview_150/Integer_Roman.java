package Top_Interview_150;

public class Integer_Roman {
    public static String intToRoman(int num) {
        int[] n = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] s = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n.length; i++) {
            while (num >= n[i]) {
                num -= n[i];
                sb.append(s[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 3749;

        System.out.println(intToRoman(num));
    }
}
