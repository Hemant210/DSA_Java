package Data_structure_Practice.Strings;

public class Practice {
    public static void main(String[] args) {
        // int len = 0;

        // char[] st = str.toCharArray();

        // for(int i = 0; i < st.length; i++){
        // len++;
        // }

        // System.out.println(len);
        // for (char ch : str.toCharArray()) {
        // System.out.println(ch + " ");
        // }

        // System.out.println();
        String str = "Hemant Patil";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(sb.toString());


        //Without Stringbuilder
        char[] arr = str.toCharArray();

        int st = 0, end = arr.length - 1;

        while (st < end) {
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }

        System.out.println(new String(arr));
    }
}
