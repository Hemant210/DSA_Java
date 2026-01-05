package Data_structure_Practice.Arrays;

import java.util.ArrayList;

public class FindMinMax {
    public static ArrayList<Integer> findminimaxi(int[] arr){
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < mini) mini = arr[i];
            if(arr[i]> maxi) maxi = arr[i];
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(mini);
        result.add(maxi);
        return result;
    }
    
    public static void main(String[] args) {
         int[] arr = {3, 5, 4, 1, 9};
         ArrayList<Integer> result = findminimaxi(arr);
         System.out.println(result.get(0) + " " + result.get(1));
    }
}
