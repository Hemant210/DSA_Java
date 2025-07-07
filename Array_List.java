import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //Add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //Get elements
        int elements = list.get(0);
        System.out.println(elements);
        
        //Add element in Between
        list.add(1, 1);
        System.out.println(list);

        //set elements
        list.set(0,5);
        list.set(2, 54);
        System.out.println(list);

        //Remove element
        list.remove(3);
        System.out.println(list);

        //Size
        int size = list.size();
        System.out.println(size);

        //Loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //Sort
        Collections.sort(list); 
        System.out.println(list);

        }    

}
