package Data_structure_Practice.Strings;

public class Add_Binary {

    // Approach 1: Manual Binary Addition
    // Time Complexity :- O(n) & Space Complexity :- O(n)
    public String addbinary(String a, String b) {

        StringBuilder ans = new StringBuilder();

        int A = a.length() - 1;
        int B = b.length() - 1;

        int carry = 0;

        while (A >= 0 || B >= 0 || carry != 0) {

            int sum = carry;

            if (A >= 0)
                sum += a.charAt(A--) - '0';

            if (B >= 0)
                sum += b.charAt(B--) - '0';

            ans.append(sum % 2);
            carry = sum / 2;
        }

        return ans.reverse().toString();
    }

    // Time Complexity :- O(max(m,n)) & Space Complexity :- O(max(m,n))
    // Approach 2: Convert Binary -> Decimal -> Binary
    public String binary(String a, String b) {

        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);

        return Integer.toBinaryString(x + y);
    }

    public static void main(String[] args) {

        Add_Binary obj = new Add_Binary();

        String a = "1010";
        String b = "1011";

        System.out.println("Manual : " + obj.addbinary(a, b));
        System.out.println("Convert: " + obj.binary(a, b));
    }
}