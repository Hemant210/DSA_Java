package Data_structure_Practice.Stacks_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Buy_Tickets {
    public static int timeRequiredToBuy(int[] tickets, int k){
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++){
            queue.offer(i);
        }

        int time = 0;
        while (!queue.isEmpty()) {
            int person = queue.poll();
            tickets[person]--;
            time++;

            if (tickets[person] > 0) {
                queue.offer(person);
            }

            if (person == k && tickets[person] == 0) {
                return time;
            }
        }

        return time;
    }
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0;

        System.out.println(timeRequiredToBuy(tickets, k));
    }
}
